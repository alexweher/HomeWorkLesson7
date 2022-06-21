angular.module('market-front', []).controller('appController', function ($scope, $http) {
    const contextPath = 'http://localhost:8189/market/';



    $scope.loadProducts = function (pageIndex=1) {
        $http({
            url: contextPath + 'products',
            method: 'GET',
            params: {
                p: pageIndex
            }
        }).then(function (response) {
            console.log(response);
            $scope.productsPage = response.data;
        });
    }


    $scope.showInfo = function (product) {
        alert(product.title);
    }

     $scope.deleteById=function(product){

//     я не понял как написать медод удаления из бд
// дайте пожалуйста обратную связь, а то дальше не смогу двигаться в уроках, если не разберусь с этим

     }


    $scope.loadProducts(1);


});