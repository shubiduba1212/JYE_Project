package polymorphism.alcoholtherapy;

public interface Drinks {

  /* 질문의 종류 : */
  /* 1. 좋아요😊 || 2. 보통😐 || 3. 별로에요😑 || 4. 모르겠어요🙄 */
  /* 1. 좋아요😊 || 2. 보통😐 || 3. 별로에요😑 || 4. 모르겠어요🙄 */
  /* 1. 단맛 || 2. 드라이한맛 || 3. 특별한맛 || 4. 모르겠어요🙄 */

  //모든 종류의 음료 배열
  String[] drinkArr = new String[]{"화이트와인🥂", "레드 와인🍷", "싱글몰트 위스키\uD83E\uDD43", "버번 위스키\uD83E\uDD43", "스카치 위스키\uD83E\uDD43", "피치크러시",
          "준벅\uD83C\uDF78", "피나콜라다\uD83C\uDF78", "모히또\uD83C\uDF78", "깔루아밀크\uD83C\uDF79", "블루하와이\uD83C\uDF79", "롱아일랜드아이스티\uD83C\uDF79",
          "코스모폴리탄\uD83C\uDF79", "얼그레이하이볼\uD83C\uDF7A", "레몬하이볼\uD83C\uDF7A", "산토리하이볼\uD83C\uDF7A", "진저하이볼\uD83C\uDF7A"};
  //단맛 음료
  String[] sweetArr = new String[]{"피치크러시🍑","준벅\uD83C\uDF78", "피나콜라다\uD83C\uDF78", "모히또\uD83C\uDF78", "깔루아밀크\uD83C\uDF79", "블루하와이\uD83C\uDF79"};

  //드라이한 맛 음료
  String[] dryArr = new String[]{"화이트와인🥂", "레드 와인🍷", "코스모폴리탄\uD83C\uDF79","싱글몰트 위스키\uD83E\uDD43", "버번 위스키\uD83E\uDD43", "스카치 위스키\uD83E\uDD43"};

  //특별한 맛 음료
  String[] specialArr = new String[]{"롱아일랜드아이스티\uD83C\uDF79", "얼그레이하이볼\uD83C\uDF7A", "레몬하이볼\uD83C\uDF7A", "산토리하이볼\uD83C\uDF7A", "진저하이볼\uD83C\uDF7A"};

  //Random 으로 음료 선정하기
  public abstract String selectDrinks(int[] intArr);

  //각 맛에 해당하는 음료 배열 안에서 랜덤으로 선정하기
  public abstract String makeArray(String[] strArr);
}
