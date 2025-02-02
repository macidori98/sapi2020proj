package ro.sapientia2015.story.dto;

import org.apache.commons.lang.builder.ToStringBuilder;
import org.hibernate.validator.constraints.Length;
import org.hibernate.validator.constraints.NotEmpty;

import ro.sapientia2015.story.model.Daily;


public class DailyDTO {

    private Long id;

    @Length(max = Daily.MAX_LENGTH_DESCRIPTION)
    private String description;

    @NotEmpty
    @Length(max = Daily.MAX_LENGTH_TITLE)
    private String title;
    
    @NotEmpty
    @Length(max = Daily.MAX_LENGTH_DATEE)
    private String datee;
    
    @NotEmpty
    @Length(max = Daily.MAX_LENGTH_DURATION)
    private String duration;

    public DailyDTO() {

    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDatee() {
		return datee;
	}

	public String getDuration() {
		return duration;
	}

	public void setDatee(String datee) {
		this.datee = datee;
	}

	public void setDuration(String duration) {
		this.duration = duration;
	}

	@Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this);
    }
}
