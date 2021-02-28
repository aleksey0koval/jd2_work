<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<jsp:include page="header.jsp"/>

    <h1>Found products:</h1>
   <!--  -->
    <table class="table">
      <thead>
        <tr>
          <th scope="col">#</th>
          <th scope="col">Product code</th>
          <th scope="col">Name</th>
          <th scope="col">Description</th>
        </tr>
      </thead>
      <tbody>
      <c:forEach items="${searchResult}" var="productItem">
        <tr>
          <th scope="row"><a href="/web/product/${productItem.productId}">Open</a></th>
          <td>${productItem.productId}</td>
          <td>${productItem.productName}</td>
          <td>${productItem.description}</td>
        </tr>
        </c:forEach>
      </tbody>
    </table>

<jsp:include page="footer.jsp"/>