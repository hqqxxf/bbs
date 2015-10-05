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
		pageTop: 'module/pageTop'
	}
});

require([module], function(module) {
	//console.log(module);
})