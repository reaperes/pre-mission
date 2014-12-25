<!DOCTYPE html>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head lang="en">
  <meta charset="UTF-8">
  <title>Next innovation</title>
  <link rel="stylesheet" type="text/css" href="../../static/stylesheets/reset.css">
  <link rel="stylesheet" type="text/css" href="../../static/stylesheets/main.css">
</head>
<body>
<header id="logoContainer">
  <img src="../../static/images/logo.png"/>
</header>
<aside id="recent-container">
  <h2 id="recent-container-title">Recent post</h2>
  <ol id="recent-post-container">
    <%--@elvariable id="posts" type="java.util.List"--%>
    <c:forEach var="post" items="${posts}">
      <li>
        <h3 class="recent-post-title">
          ${post.id}
        </h3>
      </li>
    </c:forEach>
    <li><h3 class="recent-post-title">Recent post 1</h3></li>
    <li><h3 class="recent-post-title">Recent post 2</h3></li>
    <li><h3 class="recent-post-title">Recent post 3</h3></li>
    <li><h3 class="recent-post-title">Recent post 4</h3></li>
    <li><h3 class="recent-post-title">Recent post 5</h3></li>
    <li><h3 class="recent-post-title">Recent post 6</h3></li>
    <li><h3 class="recent-post-title">Recent post 7</h3></li>
  </ol>
</aside>
<main id="post-container">
  <article class="post">
    <h1 class="post-Title">Title</h1>
    <div class="post-meta-container">
      <h4 class="post-author">Author</h4>
      <time class="post-register-date">December 5, 2013</time>
    </div>
    <p>Lorem ipsum dolor sit amet, consectetur adipiscing elit. Sed non commodo libero. Ut mattis justo ac massa
      blandit blandit. Maecenas tincidunt ac orci vitae dapibus. Sed blandit luctus enim a bibendum. Duis eu
      bibendum nulla, in iaculis odio. Sed nisi nisi, rhoncus sed tempor eget, mollis vel magna. Etiam vel massa
      sagittis, dapibus nisi nec, pulvinar est. Morbi lacinia a quam ut consequat. Pellentesque orci nisi, tempor
      sit amet ipsum eget, consequat cursus leo. Duis placerat congue arcu, quis imperdiet metus.</p>
  </article>
  <article class="post">
    <h1 class="post-Title">Title</h1>
    <div class="post-meta-container">
      <h4 class="post-author">Author</h4>
      <time class="post-register-date">December 5, 2013</time>
    </div>
    <p>Lorem ipsum dolor sit amet, consectetur adipiscing elit. Sed non commodo libero. Ut mattis justo ac massa
      blandit blandit. Maecenas tincidunt ac orci vitae dapibus. Sed blandit luctus enim a bibendum. Duis eu
      bibendum nulla, in iaculis odio. Sed nisi nisi, rhoncus sed tempor eget, mollis vel magna. Etiam vel massa
      sagittis, dapibus nisi nec, pulvinar est. Morbi lacinia a quam ut consequat. Pellentesque orci nisi, tempor
      sit amet ipsum eget, consequat cursus leo. Duis placerat congue arcu, quis imperdiet metus.</p>
  </article>
  <article class="post">
    <h1 class="post-Title">Title</h1>
    <div class="post-meta-container">
      <h4 class="post-author">Author</h4>
      <time class="post-register-date">December 5, 2013</time>
    </div>
    <p>Lorem ipsum dolor sit amet, consectetur adipiscing elit. Sed non commodo libero. Ut mattis justo ac massa
      blandit blandit. Maecenas tincidunt ac orci vitae dapibus. Sed blandit luctus enim a bibendum. Duis eu
      bibendum nulla, in iaculis odio. Sed nisi nisi, rhoncus sed tempor eget, mollis vel magna. Etiam vel massa
      sagittis, dapibus nisi nec, pulvinar est. Morbi lacinia a quam ut consequat. Pellentesque orci nisi, tempor
      sit amet ipsum eget, consequat cursus leo. Duis placerat congue arcu, quis imperdiet metus.</p>
  </article>
  <article class="post">
    <h1 class="post-Title">Title</h1>
    <div class="post-meta-container">
      <h4 class="post-author">Author</h4>
      <time class="post-register-date">December 5, 2013</time>
    </div>
    <p>Lorem ipsum dolor sit amet, consectetur adipiscing elit. Sed non commodo libero. Ut mattis justo ac massa
      blandit blandit. Maecenas tincidunt ac orci vitae dapibus. Sed blandit luctus enim a bibendum. Duis eu
      bibendum nulla, in iaculis odio. Sed nisi nisi, rhoncus sed tempor eget, mollis vel magna. Etiam vel massa
      sagittis, dapibus nisi nec, pulvinar est. Morbi lacinia a quam ut consequat. Pellentesque orci nisi, tempor
      sit amet ipsum eget, consequat cursus leo. Duis placerat congue arcu, quis imperdiet metus.</p>
  </article>
  <article class="post">
    <h1 class="post-Title">Title</h1>
    <div class="post-meta-container">
      <h4 class="post-author">Author</h4>
      <time class="post-register-date">December 5, 2013</time>
    </div>
    <p>Lorem ipsum dolor sit amet, consectetur adipiscing elit. Sed non commodo libero. Ut mattis justo ac massa
      blandit blandit. Maecenas tincidunt ac orci vitae dapibus. Sed blandit luctus enim a bibendum. Duis eu
      bibendum nulla, in iaculis odio. Sed nisi nisi, rhoncus sed tempor eget, mollis vel magna. Etiam vel massa
      sagittis, dapibus nisi nec, pulvinar est. Morbi lacinia a quam ut consequat. Pellentesque orci nisi, tempor
      sit amet ipsum eget, consequat cursus leo. Duis placerat congue arcu, quis imperdiet metus.</p>
  </article>
  <article class="post">
    <h1 class="post-Title">Title</h1>
    <div class="post-meta-container">
      <h4 class="post-author">Author</h4>
      <time class="post-register-date">December 5, 2013</time>
    </div>
    <p>Lorem ipsum dolor sit amet, consectetur adipiscing elit. Sed non commodo libero. Ut mattis justo ac massa
      blandit blandit. Maecenas tincidunt ac orci vitae dapibus. Sed blandit luctus enim a bibendum. Duis eu
      bibendum nulla, in iaculis odio. Sed nisi nisi, rhoncus sed tempor eget, mollis vel magna. Etiam vel massa
      sagittis, dapibus nisi nec, pulvinar est. Morbi lacinia a quam ut consequat. Pellentesque orci nisi, tempor
      sit amet ipsum eget, consequat cursus leo. Duis placerat congue arcu, quis imperdiet metus.</p>
  </article>
</main>
</body>
</html>