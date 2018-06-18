app.service('lier88Service', function($http) {

	this.add = function(entity) {
		return $http.post('../lier88/add.do', entity);
	};
	this.search = function(pageNum, pageSize, searchEntity) {
		return $http.post('../lier88/search.do?pageNum=' + pageNum
				+ '&pageSize=' + pageSize, searchEntity);
	};
	
});