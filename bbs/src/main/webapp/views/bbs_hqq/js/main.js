require.config({
	baseUrl: 'js',
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
	console.log(module);
})