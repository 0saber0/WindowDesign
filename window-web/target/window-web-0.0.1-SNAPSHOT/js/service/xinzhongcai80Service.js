app.service('xinzhongcai80Service', function($http) {

	this.add = function(entity) {
		return $http.post('../xinzhongcai80/add.do', entity);
	};
	this.search = function(pageNum, pageSize, searchEntity) {
		return $http.post('../xinzhongcai80/search.do?pageNum=' + pageNum
				+ '&pageSize=' + pageSize, searchEntity);
	};
	
});