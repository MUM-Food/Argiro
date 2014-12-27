<%-- 
    Document   : card
    Created on : Dec 25, 2014, 9:30:04 PM
    Author     : sunil
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <link rel="stylesheet" href="//netdna.bootstrapcdn.com/bootstrap/3.0.0/css/bootstrap.min.css">

        <!--<link rel="stylesheet" href="resources/css/main.css"/>-->
        <!--<script src="resources/js/controller.js"></script>-->
        <!--        <script>
                    alert('call js here...');
        
                    var cardApp = angular.module('cardApp', []);
                    cardApp.controller('cardCtrl', function ($scope, $http) {
                        $scope.refreshCard = function (cardId) {                   
                            $http.get('rest/card/' + $scope.cardId)
                                    .success(function (data) {
                                        $scope.card = data;
                                    });
                        };
        
                        $scope.clearCard = function () {
                            
                            $http.delete('rest/card/' + $scope.cardId)
                                    .success(function (data) {
                                        $scope.card = data;
                                    });
                        };
        
                        $scope.initCardId = function (cardId) {
                            $scope.cardId = cardId;
                            $scope.refreshCard($scope.cardId);
                        };
        
                        $scope.addToCard = function (productId) {
                            alert('call add in js');
                            $http.put('rest/card/add' + productId)
                                    .success(function (data) {
                                        $scope.refreshCard($http.get('rest/card/get/cardId'));
                                        alert("Product Successfully added to the Cart!");
                                    });
                        };
        
                        $scope.removeFromCard = function (productId) {
                            $http.put('rest/card/remove/' + productId)
                                    .success(function (data) {
                                        $scope.refreshCard($http.get('rest/card/get/cardId'));
                                    });
                        };
        
                    });
                </script>-->
        <script>
            var cartApp = angular.module('cartApp', []);
            cartApp.controller('cartCtrl', function ($scope, $http) {
                alert("fist");
                $scope.refreshCart = function (cartId) {
                    $http.get('/rest/card/' + $scope.cartId)
                            .success(function (data) {
                                $scope.cart = data;
                            });
                };
                $scope.clearCart = function () {
                      alert("fist11");
                    $http.delete('/rest/card/' + $scope.cartId)
                            .success($scope.refreshCart($scope.cartId));
                };
                $scope.initCartId = function (cartId) {
                      alert("fist22");
                    $scope.cartId = cartId;
                    $scope.refreshCart($scope.cartId);
                };
                $scope.addToCart = function (productId) {
                      alert("fist33");
                    $http.put('/rest/card/add/' + productId)
                            .success(function (data) {
                                alert('dfd');
                                $scope.refreshCart($http.get
                                ('/rest/card/get/cartId'));
                                alert("Product Successfully added to the Cart!");
                            });
                };
                $scope.removeFromCart = function (productId) {
                      alert("fist44");
                    $http.put('rest/card/remove/' + productId)
                            .success(function (data) {
                                $scope.refreshCart($http.get
                                        ('/rest/card/get/cartId'));
                            });
                };
            });
        </script>


    </head>
    <body>
        <h1>THIS IS MUM</h1>
        <section>
            <div class="jumbotron">
                <div class="container">
                    <h1>Cart</h1>
                    <p>All the selected products in your cart</p>
                </div>
            </div>
        </section>
        <section class="container" ng-app="cartApp">
            <div ng-controller="cartCtrl" nginit="initCardId('${cardId}')">
                <div>
                    <a class="btn btn-danger pull-left"
                       ng-click="clearCard()"> <span
                            class="glyphicon glyphicon-remove-sign"></span> Clear
                        Cart
                    </a> <a href="#" class="btn btn-success pull-right"> <span
                            class="glyphicon-shopping-cart glyphicon"></span> Check
                        out
                    </a>
                </div>
                <table class="table table-hover">
                    <tr>
                        <th>Product</th>
                        <th>Unit price</th>
                        <th>Quantity</th>
                        <th>Price</th>
                        <th>Action</th>
                    </tr>
                    <tr ng-repeat="item in card.cardItems">
                        <td>{{item.product.productId}}-{{item.product.name}}</
                            td>
                        <td>{{item.product.unitPrice}}</td>
                        <td>{{item.quantity}}</td>
                        <td>{{item.totalPrice}}</td>
                        <td><a href="#" class="label label-danger" ngclick="
                               removeFromCard(item.product.productId)"> <span
                                    class="glyphicon glyphicon-remove" /></span> Remove
                            </a></td>
                    </tr>
                    <tr>
                        <th></th>
                        <th></th>
                        <th>Grand Total</th>
                        <th>{{card.grandTotal}}</th>
                        <th></th>
                    </tr>
                </table>
                <a href="<spring:url value="/products" />
                   <span class="glyphicon-hand-left glyphicon"></span>
                    Continue shopping
                </a>
            </div>
        </section>
    </body>
</html>
