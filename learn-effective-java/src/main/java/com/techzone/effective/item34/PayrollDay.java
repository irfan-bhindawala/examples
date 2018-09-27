package com.techzone.effective.item34;

public enum PayrollDay {
    MONDAY, TUESDAY, WEDNESSDAY, THURSDAY, FRIDAY,
    SATURDAY(PayType.WEECKEND), SUNDAY(PayType.WEECKEND);

    private final PayType payType;

    PayrollDay(PayType payType) {
        this.payType = payType;
    }

    PayrollDay() {
        this(PayType.WEECKDAY);
    }

    int pay(int workingMinutes, int payScale) {
        return payType.pay(workingMinutes, payScale);
    }

    private enum PayType {
        WEECKDAY {
            @Override
            int overtimePay(int workingMinutes, int payScale) {
                return workingMinutes <= MINS_PER_SHIFT ? 0 : (workingMinutes - MINS_PER_SHIFT) * payScale / 2;
            }
        },
        WEECKEND {
            @Override
            int overtimePay(int workingMinutes, int payScale) {
                return workingMinutes * payScale / 2;
            }
        };

        private static final int MINS_PER_SHIFT = 8 * 60;

        abstract int overtimePay(int workingMinutes, int payScale);

        public int pay(int workingMinutes, int payScale) {
            int basePay = workingMinutes * payScale;
            return basePay + overtimePay(workingMinutes, payScale);
        }
    }
}