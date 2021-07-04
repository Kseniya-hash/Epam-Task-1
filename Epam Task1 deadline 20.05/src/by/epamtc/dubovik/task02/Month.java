package by.epamtc.dubovik.task02;

public enum Month {
	JANUARY {
		public int getDays(){
			final int DAYSINMONTH = 31;
			return DAYSINMONTH;
		}
	},
	FEBRUARY {
		public int getDays(){
			final int DAYSINMONTH = 28;
			return DAYSINMONTH;
		}
	},
	MARCH {
		public int getDays(){
			final int DAYSINMONTH = 31;
			return DAYSINMONTH;
		}
	},
	APRIL {
		public int getDays(){
			final int DAYSINMONTH = 30;
			return DAYSINMONTH;
		}
	},
	MAY {
		public int getDays(){
			final int DAYSINMONTH = 31;
			return DAYSINMONTH;
		}
	},
	JUNE {
		public int getDays(){
			final int DAYSINMONTH = 30;
			return DAYSINMONTH;
		}
	},
	JULY {
		public int getDays(){
			final int DAYSINMONTH = 31;
			return DAYSINMONTH;
		}
	},
	AUGUST {
		public int getDays(){
			final int DAYSINMONTH = 31;
			return DAYSINMONTH;
		}
	},
	SEPTEMBER {
		public int getDays(){
			final int DAYSINMONTH = 30;
			return DAYSINMONTH;
		}
	},
	OCTOBER {
		public int getDays(){
			final int DAYSINMONTH = 31;
			return DAYSINMONTH;
		}
	},
	NOVEMBER {
		public int getDays(){
			final int DAYSINMONTH = 30;
			return DAYSINMONTH;
		}
	},
	DECEMBER {
		public int getDays(){
			final int DAYSINMONTH = 31;
			return DAYSINMONTH;
		}
	};

	public int getDays() {
		return this.getDays();
	}
}
