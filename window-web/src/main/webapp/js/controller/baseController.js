app.controller('baseController', function($scope) {
	// 分页控件配置
	$scope.paginationConf = {
		currentPage : 1,
		totalItems : 10,
		itemsPerPage : 10,
		perPageOptions : [ 10, 15, 20, 30, 40, 50 ],
		onChange : function() {
			$scope.reloadList();
		}
	};

	// 刷新列表
	$scope.reloadList = function() {
		$scope.search($scope.paginationConf.currentPage,
				$scope.paginationConf.itemsPerPage);
	};
	// 定义一个存储id的集合
	$scope.selectIds = [];

	// 用户勾选复选框
	$scope.updateSelection = function($event, id) {
		// 如果目标被选中
		if ($event.target.checked) {
			$scope.selectIds.push(id);// 在选中的集合中添加该ID
		} else {
			// 如果取消选中，就找出该ID所在的位置
			var index = $scope.selectIds.indexOf(id);
			// 移除该ID,参数一：移除的位置，参数二：移除的个数。
			$scope.selectIds.splice(index, 1);
		}
	};
	
	//json转字符串
	$scope.jsonToString=function(jsonString,key){
		var json = JSON.parse(jsonString);
		var value = "";
		for(var i=0;i<json.length;i++){
			if(i>0){
				value += ",";
			}
			value += json[i][key];
		}
		return value;
	}

});