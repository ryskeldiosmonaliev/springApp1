package osmonaliev;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSpring {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext  context = new ClassPathXmlApplicationContext("applicationContex.xml");
//       Music music=context.getBean("MusicBean",Music.class);
//       MusicPlayer musicPlayer = new MusicPlayer(music);
//        MusicPlayer firstmusicPlayer =context.getBean("musicPlayer",MusicPlayer.class);
//        firstmusicPlayer.playMusic();
//        System.out.println(firstmusicPlayer.getName());
//        System.out.println(firstmusicPlayer.getVolume());
//
//        MusicPlayer secondmusicPlayer = context.getBean("musicPlayer",MusicPlayer.class);
//        boolean comparion = firstmusicPlayer==secondmusicPlayer;//scope singelton true prototype false
//        System.out.println(comparion);
//        System.out.println(firstmusicPlayer);//has  могут отличатся если prototype если  singelton nj jyb c[j;b
//        System.out.println(firstmusicPlayer);
//
//        firstmusicPlayer.setVolume(10);//если singelton то изменется firstmusicPlayer.getVolume() на 10 и secondmusicPlayer.getVolume() тоже на 10
//        //если prototype то firstmusicPlayer.getVolume() изменятся на 10 а secondmusicPlayer.getVolume() останется каким был
//        System.out.println(firstmusicPlayer.getVolume());
//        System.out.println(secondmusicPlayer.getVolume());
       ClasicalMusic clasicalMusic= context.getBean("musicBean",ClasicalMusic.class);
        System.out.println(clasicalMusic.getSong());//сначала выведится метод doNyInit()  потом getSong() и конце doMyDectroy()
        context.close();
        //fatory medod - создание обекта

    }
}
