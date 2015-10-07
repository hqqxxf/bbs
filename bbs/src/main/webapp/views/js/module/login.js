define(['lex'],function(lex){
	var login = {
		el: {
			login: document.getElementById("login")
		},
		init: function(){
			this.el.login.onclick = this.toLogin;
		},
		toLogin: function(){
			lex.ajax({
				url: basePath + '/user/login.do',
				method: "post",
				success: function(res){
					console.log(res);
				},
				error: function(err){
					console.log(err);
				}
			})
		}
	};
	login.init();
});