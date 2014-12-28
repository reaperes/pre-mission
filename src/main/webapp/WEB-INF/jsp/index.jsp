<!DOCTYPE html>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head lang="en">
  <meta charset="UTF-8">
  <title>A D A &nbsp; B L A C K J A C K</title>
  <link rel="stylesheet" type="text/css" href="../../static/stylesheets/reset.css">
  <link rel="stylesheet" type="text/css" href="../../static/stylesheets/main.css">
</head>
<body>
<header id="logo-container">
  <div id="logo-title-container">
    <h1 id="logo-title">B L O G</h1>
  </div>
</header>
<div class="trigger" id="trigger-1"></div>
<aside id="recent-container">
  <h2 id="recent-container-title">RECENT POSTS</h2>
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
  <form id="post-new-form">
    <label>Email: <input type="email" name="email"></label>
    <label>Password: <input type="password" name="password"></label><br/>
    <label><textarea name="content" rows="4" cols="104"></textarea><br/></label>
    <input type="submit" value="Submit"/>
  </form>
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
<script type="text/javascript" src="../../static/javascripts/jquery-2.1.3.min.js"></script>
<script type="text/javascript" src="../../static/javascripts/jquery-extend.js"></script>
<script type="text/javascript" src="../../static/javascripts/jquery.scrollmagic.js"></script>
<script type="text/javascript" src="../../static/javascripts/jquery.scrollmagic.debug.js"></script>
<script type="text/javascript" src="../../static/javascripts/main.js"></script>
</body>
</html>