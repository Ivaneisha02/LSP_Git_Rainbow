package org.howard.edu.lsp.midterm.problem2;

public class Range {
	
	
	private Integer start;
	private Integer end;
	
	
	public Range(Integer start,Integer end) {
		this.start = start;
		this.end = end;
	}
	
	public boolean isValueInRange(Integer value) {
		
		if ((value >= this.start) && (value <= this.end)) {
			return true;
		}
		return false;
	};
	
	public boolean doRangesOverlap(Range otherRange) {
		Range other = (Range) otherRange;
		//if other start btw this start and end
		// if other end btw this start and end
		if ((other.start<=this.end) && (other.start>=this.start)) {
			return true;
		}
		if ((other.end<=this.end) && (other.end>=this.start)) {
			return true;
		}
		return false;
		
	}
	
	public Integer size() {
		return (this.end - this.start);
	}
}
