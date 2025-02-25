package com.jin.javastudy.nestedIf;

public class JavaMain {
    public static void question () {
        // 다음 if 중첩문을 줄이기 위한 방법은?
        int age = 20;
        String membership = "GOLD";

        if (age >= 18) {
            System.out.println("성인입니다. 서비스 이용 가능 여부를 확인합니다.");
            if (membership.equals("GOLD")) {
                System.out.println("GOLD 회원이므로 모든 서비스 이용 가능합니다.");
            } else {
                if (membership.equals("SILVER")) {
                    System.out.println("SILVER 회원이므로 일부 서비스 이용 가능합니다.");
                } else {
                    System.out.println("일반 회원이므로 기본 서비스만 이용 가능합니다.");
                }
            }
        } else {
            System.out.println("미성년자는 서비스를 이용할 수 없습니다.");
        }
    }

    public static void main(String[] args) {
        int age = 20;
        String membership = "GOLD";
        System.out.println(getMembershipMessage1(age, membership));

    }

    public static String getMembershipMessage1 (int age, String membership) {
        if (age < 18) {
            return "미성년자는 서비스를 이용할 수 없습니다.";
        }
        System.out.println("성인입니다. 서비스 이용 가능 여부를 확인합니다.");

        if (membership.equals("GOLD")) {
            return "GOLD 회원이므로 모든 서비스 이용 가능합니다.";
        }
        if (membership.equals("SILVER")) {
            return "SILVER 회원이므로 일부 서비스 이용 가능합니다.";
        }
        return "일반 회원이므로 기본 서비스만 이용 가능합니다.";
    }

    public static String getMembershipMessage2 (int age, String membership) {
        if (age < 18) {
            return "미성년자는 서비스를 이용할 수 없습니다.";
        }
        System.out.println("성인입니다. 서비스 이용 가능 여부를 확인합니다.");

        return switch (membership) {
            case "GOLD" -> "GOLD 회원이므로 모든 서비스 이용 가능합니다.";
            case "SILVER" -> "SILVER 회원이므로 일부 서비스 이용 가능합니다.";
            default -> "일반 회원이므로 기본 서비스만 이용 가능합니다.";
        };
    }
}
