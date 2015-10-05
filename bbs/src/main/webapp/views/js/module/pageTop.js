define(['lex'], function(lex) {
	var pageTop = {
		count: 0,
		init: function() {
			this.adaptPhoneNav();
			window.onresize = this.adaptPhoneNav;
		},
		adaptPhoneNav: function() {
			var nav = document.getElementById("nav"),
				menuIcon = document.getElementById("menuIcon"),
				navList = document.getElementById("navList"),
				width = document.body.clientWidth;
			if (width <= 500) {
				lex.removeClass(menuIcon, 'hide');
				lex.addClass(nav, 'hide');
			} else{
				lex.addClass(menuIcon, 'hide');
				lex.removeClass(nav, 'hide');
				lex.addClass(navList, 'hide');
			}

			menuIcon.onclick = function() {
				pageTop.count++;
				if(pageTop.count % 2){
					lex.removeClass(navList, 'hide');
				}else{
					lex.addClass(navList, 'hide');
				}
				
			}
		}
	};
	return {
		init: function() {
			pageTop.init();
		}
	}
});