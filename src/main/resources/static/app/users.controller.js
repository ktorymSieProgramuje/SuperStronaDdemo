/**
 * Created by dan.geabunea on 3/29/2016.
 */
(function () {
    'use strict';

    angular
        .module('app')
        .controller('UserController', UserController);

    UserController.$inject = ['$http'];

    function UserController($http) {
        var vm = this;

        vm.users = [];
        vm.getAll = getAll;
        vm.deleteUser = deleteUser;

        init();

        function init(){
            getAll();
        }

        function getAll(){
            var url = "/users/all";
            var usersPromise = $http.get(url);
            usersPromise.then(function(response){
                vm.users = response.data;
            });
        }


        function deleteUser(id){
            var url = "/users/delete/" + id;
            $http.post(url).then(function(response){
                vm.users = response.data;
            });
        }
    }
})();
