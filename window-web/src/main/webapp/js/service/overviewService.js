app.service('overviewService', function($http) {

	this.search = function(pageNum, pageSize, searchOption) {
		return $http.post('../overview/search.do?pageNum=' + pageNum
				+ '&pageSize=' + pageSize, searchOption);
	};
	
});