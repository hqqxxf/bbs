define({
	hasClass : function(obj, classname) {
		var reg = new RegExp('(\\s|^)' + classname + '(\\s|$)', "g");
		return reg.test(obj.className);
	},
	addClass : function(obj, classname) {
		if (!this.hasClass(obj, classname)) {
			obj.className += " " + classname;
		}
	},
	removeClass : function(obj, classname) {
		if (this.hasClass(obj, classname)) {
			var reg = new RegExp('(\\s|^)' + classname + '(\\s|$)', "g");
			obj.className = obj.className.replace(reg, ' ');
		}
	},
	mergeObj : function(o1, o2) {
		for ( var key in o2) {
			o1[key] = o2[key]
		}
		return o1;
	},
	cookie : {
		getCookie : function(c_name) {
			if (document.cookie.length > 0) {
				c_start = document.cookie.indexOf(c_name + "=");
				if (c_start != -1) {
					c_start = c_start + c_name.length + 1;
					c_end = document.cookie.indexOf(";", c_start);
					if (c_end == -1)
						c_end = document.cookie.length;
					return unescape(document.cookie.substring(c_start, c_end));
				}
			}
			return "";
		},
		setCookie : function(c_name, value, expiredays) {
			var exdate = new Date();
			exdate.setDate(exdate.getDate() + expiredays);
			document.cookie = c_name
					+ "="
					+ escape(value)
					+ ((expiredays == null) ? "" : ";expires="
							+ exdate.toGMTString());
		}
	},
	ajax : function(option) {
		var defaults = {
			url : '',
			type : 'GET',
			data : "",
			async : true,
			dataType : "JSON",
			success : null,
			error : null
		};
		var opts = this.mergeObj(defaults, option);
		var xhr = XMLHttpRequest ? new XMLHttpRequest() : new ActiveXObject(
				"Microsoft.XMLHTTP");
		xhr.open(opts.type, opts.url, opts.async);
		xhr.send(opts.data);
		xhr.onreadystatechange = function() {
			if (xhr.readyState == 4 && xhr.status == 200) {
				opts.success.call(this, xhr.responseText);
			}
		}
	}

})
