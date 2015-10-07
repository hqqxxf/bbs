require.config({
	baseUrl: basePath + '/views/js',
	paths: {
		/*
		 * libs
		 * */
		lex: 'libs/lex',
		/*
		 * module
		 */
		index: 'module/index',
		pageTop: 'module/pageTop',
		post: 'module/post',
		login: 'module/login'
	}
});

require([module], function(module) {
	console.log(module);
})