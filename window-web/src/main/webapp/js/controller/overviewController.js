app.controller('overviewController', function($scope,$controller, overviewService) {

	$controller('baseController',{$scope:$scope});
	
	// 初始化
	$scope.searchOption = {};
	// 条件查询
	$scope.search = function(pageNum, pageSize) {
		overviewService.search(pageNum, pageSize, $scope.searchOption).success(
				function(response) {
					$scope.totleAreas = response.areas;
					$scope.list = response.listAll;
					$scope.paginationConf.totalItems = response.totalCount;
				});
	};

});