# JYE_Project

Project Title : Alcohol Theraphy에 오신 것을 환영합니다.

summary : Alcohol Theraphy Bar 바 의 바텐더(Bartender)가 고객에게 몇가지 질문을 통해 어울리는 음료와 음식을 추천해주고 페어링해주는 프로그램
고객의 답변을 바탕으로 음료 및 음식을 추천한다.
질문의 종류 : 1. 오늘의 기분, 2. 건강 상태, 3. 좋아하는 맛 또는 원하는 맛
음료의 종류 : 와인(화이트/레드), 위스키(싱글몰트, 버번, 스카치), 칵테일
음식의 종류 : 한식(닭갈비, 불고기 등등- 작업하며 수정예정), 양식(피자, 파스타, 샐러드 등등)

시스템 요구사항
[고객의 행위]
고객은 바텐더의 질문에 답하기 or 노코멘트, 음료 또는 음식 추천 요청하기, 재추천요청하기, 주문하기, 계산하기, 나가기

[바텐더의 행위]
바텐더는 고객에게 질문하기, 음료 또는 음식 추천하기, 재추천요청받기, 식음료제공하기, 계산하기, 인사하기

프로그램 시작시, 고객은 바에 이미 입장한 상태이다.
바텐더는 처음에 고객에게 인삿말과 함께 주류 또는 음식 추천을 받을 것인지 묻는다. (보기 : 1. 주류 2. 음식 3. 모두)
고객은 바텐더의 질문에 답하고 노코멘트할 수 있다. 이때, 질문에 답을 하고 다음 질문으로 넘어갔다면 이전 질문에 대한 답을 바꿀 수 없다. (바로 이전 질문으로 프로그램을 롤백할 수 없다.)
고객은 재추천요청하기를 통해 처음 질문으로 돌아갈 수 있다.
고객은 노코멘트시 다음 질문을 받거나 질문은 더이상 안받을 수도 있다.(바텐더의 질문 종료 언제든지 가능)
고객은 바텐더가 메뉴를 추천한 이후에만, 재추천을 요청할 수 있다.
고객은 바텐더의 추천메뉴가 맘에 드는 경우, 주문완료를 한다. 이때, 고객은 주문을 한 후에는 식음료 추천을 (재)요청할 수 없다. 
바텐더는 고객에게 질문하고 고객의 답변을 통해 추천할 식음료를 정한다. (각 질문에 대한 답변에 따라 추천 메뉴는 달라진다.)
바텐더는 고객이 재추천을 요청시에 다시 질문을 한다. 
바텐더는 주문완료된 식음료를 제공한다.
고객은 주문전까지는 바를 자유롭게 나갈 수 있으나, 식음료 주문 후, 계산하기전에는 바를 나갈 수 없다.
바텐더는 고객이 주문하지 않은 채 나가거나, 계산을 한 후에는 배웅인사한다.




