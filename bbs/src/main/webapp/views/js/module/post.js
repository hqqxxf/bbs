
define(['lex','pageTop'],function(lex,pageTop){
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
			this.el.commitComment.onClick = this.commitComment;
		},
		commitComment: function(){
			var value = post.el.commentText.value;
			if(value == ""){
				alert("不能为空");
			}
			lex.ajax({
				url: "post/..",
				data: value,
				method: 'post',
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
