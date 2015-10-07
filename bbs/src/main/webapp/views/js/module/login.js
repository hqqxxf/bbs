define(['jquery','lex'],function($,lex){
	var login = {
		el: {
			login: document.getElementById("login")
		},
		init: function(){
			this.el.login.onclick = this.toLogin;
		},
		toLogin: function(){
			$.ajax({
				url: basePath + '/user/login.do',
				type: "POST",
				data: {
					username: document.getElementById('username').value,
					password: document.getElementById('password').value
				},
				dataType:"json",
				success: function(res){
					if(res.user){
						window.history.go(-1);
					}
					
				},
				error: function(err){

				}
			})
		}
	};
	login.init();
});