alert('call js here');

var cardApp = angular.module('cardApp', []);
cardApp.controller('cardCtrl', function ($scope, $http) {
    $scope.refreshCard = function (cardId) {
        $http.get('rest/card/' + $scope.cardId)
                .success(function (data) {
                    $scope.card = data;
                });
    };
    
    $scope.clearCard=function(){
        $http.delete('rest/card/'+$scope.cardId)
                .success(function(data){
                    $scope.card=data;
        });        
    };
    
    $scope.initCardId=function(cardId){
        $scope.cardId=cardId;
        $scope.refreshCard($scope.cardId);
    };
    
    $scope.addToCard=function(productId){
        $http.put('rest/card/add'+productId)
                .success(function(data){
                    $scope.refreshCard($http.get('rest/card/get/cardId'));
                    alert("Product Successfully added to the Cart!");
        });
    };
    
    $scope.removeFromCard=function(productId){
        $http.put('rest/card/remove/'+productId)
                .success(function(data){
                    $scope.refreshCard($http.get('rest/card/get/cardId'));
        });
    };
    
});