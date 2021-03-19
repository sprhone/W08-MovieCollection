package dmacc.beans;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 * Sterling Rhone - sprhone
 * 202102 CIS175 26740
 * Mar 18, 2021
 */

@Entity
public class Movies {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="ID")
	private long id;
	@Column(name="Title")
	private String title;
	@Column(name="This_Movie_Is_Good")
	private String isGood;
	@Column(name="USA_Release_Year")
	private int originalReleaseYearUSA;
	@Column(name="Rating")
	private String rating;
	@Column(name="Running_Time_Min")
	private int lengthInMinutes;
	@Column(name="I_Have_Watched_It")
	private String haveWatched;
	
	public Movies() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Movies(String title, String haveWatched) {
		super();
		this.title = title;
		this.haveWatched = haveWatched;
	}

	public Movies(String title, String isGood, int originalReleaseYearUSA, String rating, int lengthInMinutes,
			String haveWatched) {
		super();
		this.title = title;
		this.isGood = isGood;
		this.originalReleaseYearUSA = originalReleaseYearUSA;
		this.rating = rating;
		this.lengthInMinutes = lengthInMinutes;
		this.haveWatched = haveWatched;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String isGood() {
		return isGood;
	}

	public void setGood(String isGood) {
		this.isGood = isGood;
	}

	public int getOriginalReleaseYearUSA() {
		return originalReleaseYearUSA;
	}

	public void setOriginalReleaseYearUSA(int originalReleaseYearUSA) {
		this.originalReleaseYearUSA = originalReleaseYearUSA;
	}

	public String getRating() {
		return rating;
	}

	public void setRating(String rating) {
		this.rating = rating;
	}

	public int getLengthInMinutes() {
		return lengthInMinutes;
	}

	public void setLengthInMinutes(int lengthInMinutes) {
		this.lengthInMinutes = lengthInMinutes;
	}

	public String isHaveWatched() {
		return haveWatched;
	}

	public void setHaveWatched(String haveWatched) {
		this.haveWatched = haveWatched;
	}

	@Override
	public String toString() {
		return "Movies [id=" + id + ", title=" + title + ", isGood=" + isGood + ", originalReleaseYearUSA="
				+ originalReleaseYearUSA + ", rating=" + rating + ", lengthInMinutes=" + lengthInMinutes
				+ ", haveWatched=" + haveWatched + "]";
	}
}
