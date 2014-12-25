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
    <%--@elvariable id="recentSummaries" type="java.util.List"--%>
    <c:forEach var="summary" items="${recentSummaries}">
      <li>
        <h3 class="recent-post-title">
          ${summary}
        </h3>
      </li>
    </c:forEach>
  </ol>
</aside>
<main id="post-container">
  <%--@elvariable id="posts" type="java.util.List"--%>
  <c:forEach var="post" items="${posts}">
    <article class="post">
      <div class="post-meta-container">
        <h4 class="post-author">${post.email}</h4>
        <time class="post-register-date">${post.beautifulDate}</time>
      </div>
      <p>${post.content}</p>
    </article>
  </c:forEach>
</main>
</body>
</html>