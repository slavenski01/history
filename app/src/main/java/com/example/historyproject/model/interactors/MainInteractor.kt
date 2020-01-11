package com.example.historyproject.model.interactors

import com.example.historyproject.R
import com.example.historyproject.entity.People

class MainInteractor {

    fun getPeoples() = listOf(
        People(
            name = "Михаил Федорович",
            avatar = R.drawable.one,
            years = "1613-1645",
            description = "После смерти Ивана «Грозного» не осталось ни одного кровного наследника рода Рюриковичей, но на свет появилась новая династия – Романовы. Свои права на трон потребовал двоюродный племянник жены Иоанна IV, Анастасии Захарьиной, Михаил. С поддержкой простого московского народа и казачества он взял бразды правления в свои руки и начал новую эпоху в истории России."
        ),
        People(
            name = "Алексей Михайлович «Тишайший»",
            avatar = R.drawable.two,
            years = "1645 – 1676",
            description = "Следом за Михаилом на трон сел его сын – Алексей. Он имел мягкий характер, за что и получил свое прозвище. Сильное влияние на него оказывал боярин Борис Морозов. Следствием этого стали Соляной бунт, восстание Степана Разина и другие крупные беспорядки."
        ),
        People(
            name = "Федор III Алексеевич",
            avatar = R.drawable.three,
            years = "1676 – 1682",
            description = "Старший сын царя Алексея. После кончины отца по закону занял престол. Первым делом возвысил своих приближенных – постельничего Языкова и комнатного стольника Лихачева. Они не были родом из знати, но на протяжении всей жизни помогали становлению Федора III. При нем была совершена попытка смягчения наказаний за уголовные преступления и отменено ампутирование конечностей как казнь. Важным в правлении царя стал указ 1862 года об уничтожении местничества."
        ),
        People(
            name = "Иван V",
            avatar = R.drawable.four,
            years = "1682 – 1696",
            description = "На момент смерти старшего брата – Федора III – Ивану V было 15 лет. Его приближенные посчитали, что он не обладает навыками присущими царю и престол должен унаследовать младший брат, 10-летний Петр I. В итоге правление отдали сразу обоим, а старшую сестру Софью сделали их регентшей. Иван V был слаб, почти слеп и слабоумен. Во время своего правления он не принимал никаких решений. Его именем подписывали указы, а самого его использовали как выходного церемониального царя. На самом деле страной руководила царевна Софья."
        ),
        People(
            name = "Петр I «Великий»",
            avatar = R.drawable.five,
            years = "1682 – 1725",
            description = "Как и старший брат, Петр занял место царя в 1682 году, но по своему малолетству не мог принимать какие-либо решения. Много времени он посвятил изучению военного дела, пока страной управляла его старшая сестра Софья. Но в 1689 году после того, как царевна решила единолично возглавить Россию, Петр I жестоко расправился с её сторонниками, а её саму заключил в Новодевичий монастырь. В его стенах она провела остаток своих дней и умерла в 1704 году. На троне остались два царя – Иван V и Петр I. Но Иван сам отдал брату все полномочия и остался правителем лишь формально. Получив власть, Петр провел ряд реформ: создание Сената, подчинение церкви государству, а также построил новую столицу – Санкт-Петербург. При нем Россия завоевала статус великой державы и признание стран Западной Европы. Также государство было переименовано в Российскую Империю, а царь стал первым императором."
        ),
        People(
            name = "Екатерина I",
            avatar = R.drawable.six,
            years = "1725 – 1727",
            description = "После смерти мужа – Петра I, заручившись поддержкой гвардии, она заняла трон. Новая правительница не обладала навыками ведения внешней и внутренней политики, сама этого не хотела, поэтому фактически страной управлял её фаворит – граф Меншиков."
        ),
        People(
            name = "Петр II",
            avatar = R.drawable.seven,
            years = "1727 – 1730",
            description = "После смерти Екатерины I права на престол были переданы внуку Петра «Великого» – Петру II. Мальчику на тот момент было всего 11 лет. А уже спустя 3 года он скоропостижно умер от оспы. Петр II уделял внимание не стране, а лишь охоте и удовольствиям. Все решения за него принимал все тот же Меншиков. После свержения графа молодой император оказался под влиянием рода Долгоруковых."
        ),
        People(
            name = "Анна Иоанновна",
            avatar = R.drawable.eight,
            years = "1730 – 1740",
            description = "После смерти Петра II Верховный тайный совет пригласил на трон дочь Ивана V Анну. Условием её восхождения на трон стало принятие ряда ограничений – «Кондиций». В них было указано, что новоиспеченная императрица не имеет права по единоличному решению объявлять войны, заключать мир, выходить замуж и назначать престолонаследника, а также некоторые другие предписания. После получения власти Анна нашла поддержку у дворянства, уничтожила подготовленные правила и распустила Верховный тайный совет. Императрица не отличалась ни умом, ни успехами в образовании. Огромное влияние на нее и на страну имел ее фаворит Эрнст Бирон. После ее смерти именно его назначили в регенты младенцу Ивану VI. Правление Анны Иоанновны является темной страницей в истории Российской империи. При ней господствовал политический террор и пренебрежение русскими традициями."
        ),
        People(
            name = "Иван VI Антонович",
            avatar = R.drawable.nine,
            years = "1740 – 1741",
            description = "Согласно завещанию императрицы Анны на престол взошел Иван VI. Он был младенцем, а потому первый год «правления» прошел под руководством Эрнста Бирона. После власть перешла к матери Ивана – Анне Леопольдовне. Но фактически правление было в руках Кабинета министров. Сам же император всю жизнь провел в заключении. А в возрасте 23 лет был убит тюремной охраной."
        ),
        People(
            name = "Елизавета Петровна",
            avatar = R.drawable.ten,
            years = "1741 – 1761",
            description = "В результате дворцового переворота при поддержке Преображенского полка к власти пришла внебрачная дочь Петра «Великого» и Екатерины. Она продолжила внешнюю политику своего отца и положила начало эпохе Просвещения, открыла Государственный Университет имени Ломоносова."
        ),
        People(
            name = "Петр III Федорович",
            avatar = R.drawable.eleven,
            years = "1761 – 1762",
            description = "Елизавета Петровна не оставила прямых наследников по мужской линии. Но еще в 1742 году позаботилась о том, чтобы линия правления Романовых не закончилась, и назначила своим наследником племянника, сына своей сестры Анны – Петра III. Новоиспеченный император управлял страной всего полгода, после чего был убит в результате заговора, возглавляемого его женой – Екатериной."
        ),
        People(
            name = "Екатерина II «Великая»",
            avatar = R.drawable.twelve,
            years = "1762 – 1796",
            description = "После гибели своего мужа Петра III стала единолично управлять империей. Из нее не получилось ни любящей жены, ни матери. Все свои силы она отдала укреплению позиции самодержавия. При ней были расширены границы России. Также ее правление повлияло на развитие науки и образования. Екатерина провела реформы и поделила территорию страны на губернии. При ней в Сенате было учреждено шесть департаментов, а Российская империя получила гордое звание одной из самых развитых держав."
        ),
        People(
            name = "Павел I",
            avatar = R.drawable.thirteen,
            years = "1796 – 1801",
            description = "Нелюбовь матери оказала на нового императора сильное влияние. Вся его политика была направлена на то, чтобы зачеркнуть все, что она сделала за годы своего правления. Он пытался сосредоточить всю власть в своих руках и свести к минимуму самоуправление. Важным шагом в его политике является указ о запрете престолонаследования женщинами. Такой порядок продлился вплоть до 1917 года, когда правление рода Романовых подошло к концу. Политика Павла I способствовала небольшому улучшению жизни крестьян, но позиции дворянства были сильно снижены. В результате уже в первые годы правления против него начал готовиться заговор. Недовольство императором возрастало в самых разных слоях общества. Итогом стала смерть в собственной комнате во время государственного переворота."
        ),
        People(
            name = "Александр I",
            avatar = R.drawable.fourteen,
            years = "1801 – 1825",
            description = "Занял престол после гибели отца, Павла I. Именно он участвовал в заговоре, однако ничего не знал о готовящемся убийстве и всю жизнь мучился от чувства вины. При его правлении увидели свет несколько важных законов: Указ о «вольных хлебопашцах», по которому крестьяне получили право выкупить себя с землей по договоренности с помещиком. Постановление о проведении реформы образования, после которой пройти обучение могли представители всех сословий. Император обещал народу принятие конституции, но проект так и остался незавершенным. Несмотря на либеральную политику, масштабных изменений в жизни страны так и не произошло. В 1825 Александр подхватил простуду и умер. Ходят легенды, что император инсценировал свою смерть и стал отшельником."
        ),
        People(
            name = "Николай I",
            avatar = R.drawable.fifteen,
            years = "1825 – 1855",
            description = "В результате смерти Александра I бразды правления должны были перейти в руки его младшего брата Константина, но он добровольно отказался от титула императора. Так престол занял третий сын Павла I Николай I. Сильнейшее влияние на него оказало воспитание, основанное на жестком подавлении личности. Рассчитывать на престол он не мог. Ребенок рос в угнетении, терпел физические наказания. Учебные путешествия во многом повлияли на взгляды будущего императора – консервативные, с ярко выраженной антилиберальной направленностью. После смерти Александра I Николай проявил всю свою решительность и политические способности и, несмотря на массу несогласных, взошел на престол. Важным этапом в становлении личности правителя стало восстание декабристов. Оно было жестоко подавлено, порядок восстановлен, а Россия присягнула на верность новому монарху. На протяжении всей жизни император считал своей целью подавление революционного движения. Политика Николая I привела к крупнейшему внешнеполитическому поражению в ходе Крымской войны 1853 – 1856 годов. Неудача подорвала здоровье императора. В 1955 году случайная простуда лишила его жизни."
        ),
        People(
            name = "Александр II",
            avatar = R.drawable.sixteen,
            years = "1855 – 1881",
            description = "Рождение Александра II привлекло к себе огромное внимание со стороны общества. В это время его отец даже не представлял его на месте правителя, однако юному Саше уже была уготована участь наследника, поскольку ни у кого из старших братьев Николая I не было детей мужского пола. Юноша получил хорошее образование. Он овладел пятью языками, в совершенстве знал историю, географию, статистику, математику, естествознание, логику и философию. Для него проводились специальные курсы под руководством влиятельных деятелей и министров. За время своего правления Александр провел много реформ: университетскую; судебную; военную и другие. Но самой важной по праву считается отмена крепостного права. За этот ход его прозвали царем-освободителем. Тем не менее, несмотря на нововведения, император оставался верен самодержавию. Такая политика не способствовала принятию конституции. Нежелание императора выбрать новый путь развития вызвало активизацию революционной деятельности. В итоге ряд покушений привел к смерти государя. 1 марта 1881 года Александр II был убит членами организации «Народная воля»."
        ),
        People(
            name = "Александр III",
            avatar = R.drawable.seventeen,
            years = "1881 – 1894",
            description = "Александр III был вторым сыном Александра II. Так как изначально он не был наследником престола, он не считал нужным получать должное образование. Лишь в сознательном возрасте будущий правитель в ускоренном темпе приступил к подготовке для царствования. В результате трагической гибели отца власть перешла к новому императору – более жесткому, но справедливому. Отличительной чертой царствования Александра III стало отсутствие войн. За это он был прозван «царем-миротворцем». Умер он в 1894 году. Причиной смерти стал нефрит – воспаление почек. Причиной заболевания считается как крушение императорского поезда на станции Борки, так и пристрастие императора к спиртному. Вот практически и все семейное генеалогическое древо рода Романовых с годами правления и портретами. Отдельное внимание стоит уделить последнему монарху."
        ),
        People(
            name = "Николай II",
            avatar = R.drawable.eighteen,
            years = "1894 – 1917",
            description = "Сын Александра III. На престол взошел в результате скоропостижной кончины отца. Он получил хорошее образование, направленное на военное воспитание, учился под руководством действующего царя, а его преподавателями были выдающиеся русские ученые. Николай II быстро освоился на троне и стал продвигать самостоятельную политику, чем и было вызвано недовольство части его окружения. Основной целью правления он сделал утверждение внутреннего единства империи. Мнения о сыне Александра весьма разрознены и противоречивы. Многие считают его чересчур мягким и слабохарактерным. Но также отмечается его сильная привязанность к семье. Он не расставался с женой и детьми до последних секунд жизни. Николай II сыграл большую роль в церковной жизни России. Частые паломничества сблизили его с коренным населением. Число храмов за время его царствования увеличилось с 774 до 1005. Позже последнего императора и его семью причислили к лику святых Русской Зарубежной Церковью (РПЦЗ). В ночь с 16 на 17 июля 1918 года после Октябрьской революции 1917 года царская семья была расстреляна в полуподвальном помещении дома Ипатьева в Екатеринбурге. Считается, что приказ отдали Свердлов и Ленин. На этой трагичной ноте заканчивается правление царского рода, которое продолжалось на протяжении более чем трех веков (с 1613 по 1917 года). Эта династия оставила огромный след в становлении России. Именно ей мы обязаны тем, что имеем сейчас. Только благодаря правлению представителей этой фамилии в нашей стране было ликвидировано крепостное право, запущены образовательная, судебная, военная и многие другие реформы"
        )
    )
}