app.service('zhongcai80Service', function($http) {

	this.add = function(entity) {
		return $http.post('../zhongcai80/add.do', entity);
	};
	this.search = function(pageNum, pageSize, searchEntity) {
		return $http.post('../zhongcai80/search.do?pageNum=' + pageNum
				+ '&pageSize=' + pageSize, searchEntity);
	};
	
});