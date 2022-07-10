angular.module('market-front', []).controller('appController', function ($scope, $http) {
    const contextPath = 'http://localhost:8189/market/api/v1';

    $scope.loadProducts=function(){
    $http.get(contextPath + '/cart')
    .then(function(response){
   console.log(response);
   $scope.cartProduct=response.data
   });
    }

