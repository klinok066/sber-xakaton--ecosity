package com.example.ecocity;

import android.content.Context;
import android.graphics.Typeface;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.Objects;

public class EventManager {

    private static int padding = 20;
    private static final ArrayList<Event> events = new ArrayList<>();

//    домашняя страница - новости
//    обращения - обращения
//    события - события

    public static void init() {
        if (events.size() > 0)
            return;

        events.add(new Event("Уборка территории в Краснолесье",
                "новости",
                "В субботу, 22 апреля, жители микрорайона Краснолесье приняли участие в субботнике и очистили от мусора зеленую территорию в квартале улиц Вонсовского — Мехренцева — Краснолесья — Чкалова. Уборку инициировали новоселы квартала «ART. Город-парк», а реализовать идею им помог застройщик — компания «Атомстройкомплекс», которая предоставила необходимые инструменты, организовала вывоз собранного мусора, а также сопроводила процесс зажигательной музыкой и веселыми конкурсами.",
                R.drawable.image1));
        events.add(new Event("Новая тропа здоровья",
                "новости",
                "Новую тропу протоптали в парке Победы в Екатеринбурге свердловские пенсионеры. 30 человек по три раза в неделю выбираются в парк, чтобы поддержать своё здоровье физическими упражнениями.",
                R.drawable.image2));
        events.add(new Event("Высадка цветов на 16 миллионов рублей",
                "новости",
                "Екатеринбург закупит цветочную рассаду, семена и другие декоративные растения для оформления города на сумму 16 миллионов 264 тысяч рублей. Соответствующий аукцион появился на сайте госзакупок.",
                R.drawable.image3));
        events.add(new Event("Дворы и улицы завалены снегом",
                "новости",
                "В мэрии ежедневно отчитываются о тоннах вывезенного снега, и, судя по всему, коммунальщики немного ожили после каникул и начали убирать снег во дворах — во всяком случае, объявления, что нужно убрать машины в определенное время, чтобы пустить во двор технику, появились на дверях подъездов многих домов.",
                R.drawable.image4));
        events.add(new Event("Дворы и улицы завалены снегом",
                "обращения",
                "Знаю, что в центре чистят и чистят, снегоуборочные машины почти круглосуточно на Ленина дежурят. А вот окраины — увы... После первого снегопада — худо-бедно, но что-то убирали. А вот после второго и третьего — тишина и покой. Нет, большие улицы — Грибоедова, Черняховского, Инженерную — убирают от снега более-менее. Боковые — так-сяк: улица Зои Космодемьянской (и так-то узкая) превратилась в одностороннюю и при движении в горку более подходит для внедорожника.",
                R.drawable.image4));
        events.add(new Event("На замусоренном пляже навели порядок",
                "новости",
                "В выходные мы писали о заваленном мусором пляже Визовского пруда, который с середины прошлой недели обещали привести в порядок. Утром 1 августа чудо наконец случилось.",
                R.drawable.image5));
        events.add(new Event("Озеленение южного парка",
                "события",
                "Сегодня в Южном парке в Ботаническом специалисты муниципального учреждения «Зеленстрой» посадили новые деревья. Растения заменили срубленный ранее клен, который угрожал падением на трамвайные провода и жителей.",
                R.drawable.image6));
        events.add(new Event("Свалка автошин",
                "обращения",
                "мкр. Старая Сортировка, пр-т Седова, д. 33\nВ центре жилого квартала в нашем дворе устроили склад автомобильных шин. Грузовики службы ТКО забирают только мусор из контейнеров. Просьба принять меры!",
                R.drawable.image7));
        events.add(new Event("Эко-пикник в парке победы",
                "события",
                "В этот понедельник на день России в парке Победы был организован эко-пикник, посвящённый празднику. Мероприятие посетило большое количество людей. В ходе пикника были организованы большие спичи на тему патриотизма, а также экологии города. По окончанию пикника ответственные за чистоту люди организовали уборку территории.",
                R.drawable.image8));
        events.add(new Event("Затопление улиц",
                "обращения",
                "мкр. Уктус, ул. Щербакова\nВыезд для жителей районов Уктус и Химмаш осложнен в связи с затоплением главной улицы, ведущей на объездную дорогу. Несколько автомобилистов уже утопили свои машины. Нынешняя ситуация продолжается 4 день. Просьба немедленно решить проблему.",
                R.drawable.image9));
    }

    public static void addEvent(Event event) {
        events.add(event);
    }

    public static void addContent(Context context, LinearLayout linearLayout, String content_type) {

        for (Event e : events) {
            if (!Objects.equals(content_type, e.getType()))
                continue;

            ImageView imageView = new ImageView(context);
            imageView.setImageResource(e.getPathToImage());
            RelativeLayout.LayoutParams params = new RelativeLayout.LayoutParams(
                    220,
                    220
            );
            imageView.setPadding(0, 0, 15, 0);
            imageView.setLayoutParams(params);

            TextView textView2 = new TextView(context);
            textView2.setText(e.getText());
            textView2.setTextSize(12);

            LinearLayout smallerLinearLayout = new LinearLayout(context);
            smallerLinearLayout.setPadding(0, 10, 0, 0);
            smallerLinearLayout.setOrientation(LinearLayout.HORIZONTAL);
            smallerLinearLayout.addView(imageView);
            smallerLinearLayout.addView(textView2);

            TextView textView1 = new TextView(context);
            textView1.setText(e.getTitle());
            textView1.setTypeface(null, Typeface.BOLD);
            textView1.setTextSize(20);

            LinearLayout biggerLinearLayout = new LinearLayout(context);
            biggerLinearLayout.setOrientation(LinearLayout.VERTICAL);
            biggerLinearLayout.addView(textView1);
            biggerLinearLayout.addView(smallerLinearLayout);

            FrameLayout frameLayout = new FrameLayout(context);
            frameLayout.setPadding(0, padding, 0, padding);
            frameLayout.addView(biggerLinearLayout);

            linearLayout.addView(frameLayout);
        }
    }
}