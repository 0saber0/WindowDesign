app.controller('zhongcai88Controller', function($scope,$controller, zhongcai88Service) {

	$controller('baseController',{$scope:$scope});
	
	$scope.typenames = ["A1", "A2", "A3", "A4", "A5"];
	

	// 添加
	$scope.save = function() {
		
		zhongcai88Service.add($scope.entity).success(function(response) {
			if (response.success) {
				$scope.reloadList();
			} else {
				alert(response.message);
			}
		});
	};

	// 初始化
	$scope.searchEntity = {};
	// 条件查询
	$scope.search = function(pageNum, pageSize) {
		zhongcai88Service.search(pageNum, pageSize, $scope.searchEntity).success(
				function(response) {
					$scope.totleAreas = response.areas;
					$scope.glassAreas = response.glassAreas;
					$scope.listA1 = response.listA1;
					$scope.listA2 = response.listA2;
					$scope.listA3 = response.listA3;
					$scope.listA4 = response.listA4;
					$scope.listA5 = response.listA5;
					$scope.paginationConf.totalItems = response.totalCount;
				});
	};

});