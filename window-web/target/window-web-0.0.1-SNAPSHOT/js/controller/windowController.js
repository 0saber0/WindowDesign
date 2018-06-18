app.controller('windowController', function($scope,$controller, windowService) {

	$controller('baseController',{$scope:$scope});
	
	$scope.names = ["中财88", "中财80", "新中财80", "力尔88", "德玛斯88"];
	
	//查询全部
	$scope.findAll = function() {
		windowService.findAll().success(function(response) {
			$scope.list = response;
		});
	};

	// 分页
	$scope.findPage = function(pageNum, pageSize) {
		windowService.findPage(pageNum, pageSize).success(function(response) {
			$scope.list = response.result;
			$scope.paginationConf.totalItems = response.totalCount;
		});
	};

	// 添加或修改
	$scope.save = function() {
		var Object = null;
		if ($scope.entity.id != null) {
			Object = windowService.update($scope.entity);
		} else {
			Object = windowService.add($scope.entity);
		}
		Object.success(function(response) {
			if (response.success) {
				$scope.reloadList();
			} else {
				alert(response.message);
			}
		});
	};

	// 查询单个
	$scope.getOne = function(id) {
		windowService.getOne(id).success(function(response) {
			$scope.entity = response;
		});
	};

	// 删除
	$scope.delet = function() {
		windowService.delet($scope.selectIds).success(function(response) {
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
		windowService.search(pageNum, pageSize, $scope.searchEntity).success(
				function(response) {
					$scope.list = response.result;
					$scope.paginationConf.totalItems = response.totalCount;
				});
	};

});