app.service('zhongcai88Service', function($http) {

	this.add = function(entity) {
		return $http.post('../zhongcai88/add.do', entity);
	};
	this.search = function(pageNum, pageSize, searchEntity) {
		return $http.post('../zhongcai88/search.do?pageNum=' + pageNum
				+ '&pageSize=' + pageSize, searchEntity);
	};
	
});