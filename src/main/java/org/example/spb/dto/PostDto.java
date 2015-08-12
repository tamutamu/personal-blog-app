package org.example.spb.dto;

import javax.validation.constraints.Size;

import org.hibernate.validator.constraints.NotEmpty;

public class PostDto {
	@Size(max = 50)
	@NotEmpty
	private String title;
	
	private String body;
	
	public PostDto() {}
	
	public PostDto(String title, String body) {
		this.title = title;
		this.body = body;
	}
	
	public String getPreview() {
		if (body.length() > 400) {
			return body.substring(0, 400); 
		}
		return body;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getBody() {
		return body;
	}

	public void setBody(String body) {
		this.body = body;
	}
}