package com.springs;

public class Shape {
	
	

		private Area area;

		public Area getArea() {
			return area;
		}

		public void setArea(Area area) {
			this.area = area;
	}

		@Override
		public String toString() {
			return "Shape [area=" + area + "]";
		}
		

}
