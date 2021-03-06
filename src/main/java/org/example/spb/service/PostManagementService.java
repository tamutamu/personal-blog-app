package org.example.spb.service;

import java.util.List;

import org.example.spb.dto.CommentDto;
import org.example.spb.dto.PostDto;

public interface PostManagementService extends CommonService<PostDto, Integer> {
	public List<PostDto> getRange(Integer start);
	public void addComment(CommentDto dto, Integer userId, Integer PostId);
	public void deleteComment(Integer id);
}