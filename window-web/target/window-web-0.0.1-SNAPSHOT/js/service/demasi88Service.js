app.service('demasi88Service', function($http) {

	this.add = function(entity) {
		return $http.post('../demasi88/add.do', entity);
	};
	this.search = function(pageNum, pageSize, searchEntity) {
		return $http.post('../demasi88/search.do?pageNum=' + pageNum
				+ '&pageSize=' + pageSize, searchEntity);
	};
	
});