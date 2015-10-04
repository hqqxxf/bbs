define({
	hasClass: function(obj, classname){
		var reg = new RegExp('(\\s|^)' + classname + '(\\s|$)', "g");
		return reg.test(obj.className);
	},
    addClass: function(obj, classname){
    	if(!this.hasClass(obj,classname)){
    		obj.className += " " + classname;
    	}
    },
    removeClass: function(obj, classname){
    	if(this.hasClass(obj, classname)){
    		var reg = new RegExp('(\\s|^)' + classname + '(\\s|$)', "g");
    		obj.className = obj.className.replace(reg, ' ');
    	}
    }
        
        
})
