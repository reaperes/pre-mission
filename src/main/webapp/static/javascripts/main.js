$(window).load(function () {
  var $form = $("#post-new-form");
  $form.submit(function () {
    var url = "posts/upload";

    $.ajax({
      type: "POST",
      url: url,
      data: $form.serialize(),
      success: function (data) {
        appendNewPost($form, data);
        clearForm();
      },
      error: function (request, status, error) {
        console.error("code:"+request.status+"\n"+"message:"+request.responseText+"\n"+"error:"+error);
      }
    });

    function clearForm() {
      $form[0].reset();
    }

    return false;
  });

  function appendNewPost($form, beautifulDate) {
    var formObj = $form.serializeObject();
    formObj.beautifulDate = beautifulDate;
    $('#post-new-form').after(makeArticle(formObj));
  }
});

function makeArticle(data) {
  var $article = $(document.createElement('article')).addClass('post');
  $article.append(
    $('<div></div>', {class: 'post-meta-container'}).append(
      $('<h4></h4>', {class: 'post-author'}).html(data.email)
    ).append(
      $('<time></time>', {class: 'post-register-date'}).html(data.beautifulDate)
    )
  ).append(
    $('<p></p>').html(data.content)
  );
  return $article;
}