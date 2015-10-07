
define(['jquery','lex','pageTop'],function($,lex,pageTop){
	pageTop.init();
	var post = {
		el: {
			theme: document.getElementById("theme"),
			comment: document.getElementById("comment"),
			commitComment: document.getElementById("commitComment"),
			commentText: document.getElementById("commentText")
		},
		init: function(){
			this.el.comment.onclick = this.clickComment;
		},
		clickComment: function(){
			var event = window.event || event,
				target = event.target || event.srcElement,
				postDiv = document.getElementById("postDiv");
			postDiv.style.display = 'block';
			$('#post_wrapper').delegate("#commitComment", 'click', function(){
				 post.commitComment.call(this);
			});
		},
		commitComment: function(){
			var value = post.el.commentText.value;
			if(value == ""){
				alert("不能为空");
			}
			$.ajax({
				url: basePath + "/post/" + themeId + "/reply.do",
				data: {
					content: value
				},
				type: 'POST',
				dataType: "json",
				success: function(res){
					console.log(res);
					
				},
				error: function(error){
					console.log(error);
				}
			});
		}
	};
	post.init();
})
