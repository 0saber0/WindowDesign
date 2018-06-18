//品牌服务
app.service('windowService', function($http) {

	this.findAll = function() {
		return $http.get('../window/findAll.do');
	};
	this.findPage = function(pageNum, pageSize) {
		return $http.get('../window/findPage.do?pageNum=' + pageNum
				+ '&pageSize=' + pageSize);
	};
	this.getOne = function(id) {
		return $http.get('../window/getOne.do?id=' + id);
	};
	this.add = function(entity) {
		return $http.post('../window/add.do', entity);
	};
	this.update = function(entity) {
		return $http.post('../window/update.do', entity);
	};
	this.delet = function(ids) {
		return $http.get('../window/delete.do?ids=' + ids);
	};
	this.search = function(pageNum, pageSize, searchEntity) {
		return $http.post('../window/search.do?pageNum=' + pageNum
				+ '&pageSize=' + pageSize, searchEntity);
	};
	this.selectOptionList = function(){
		return $http.get('../window/selectOptionList.do');
	};

});