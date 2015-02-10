package com.tomekgo.rest.resources;

import com.tomekgo.core.entities.BlogEntry;
import org.springframework.hateoas.ResourceSupport;

/**
 * Created by Tomek on 2015-01-29.
 */
public class BlogEntryResource extends ResourceSupport {
    private String title;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public BlogEntry toBlogEntry() {
        BlogEntry entry = new BlogEntry();
        entry.setTitle(title);
        return entry;
    }
}
