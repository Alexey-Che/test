package com.company;

import com.sun.deploy.security.SelectableSecurityManager;

import java.util.*;

public class Song /*implements Comparable<Song>*/ {
    private String title;
    private String artist;
    private int id;
    public static final String HELLO = "hello";

    public String getTitle() {
        return title;
    }

    public String getArtist() {
        return artist;
    }

    public int getId() {
        return id;
    }

    public Song(int id, String title, String artist) {
        this.title = title;
        this.artist = artist;
        this.id = id;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Song song = (Song) o;
        return id == song.id &&
                title.equals(song.title) &&
                artist.equals(song.artist);
    }

    @Override
    public int hashCode() {
        return Objects.hash(title, artist, id);
    }

    @Override
    public String toString() {
        return "Song{" +
                "title='" + title + '\'' +
                ", artist='" + artist + '\'' +
                ", id=" + id +
                '}';
    }

    public static void mysort (List<Song> list, Comparator<Song> c)  {
        Song s1 = list.get(0);
        Song s2 = list.get(1);
        int result = c.compare(s1, s2);
    }

    public static void mysort (List<Comparable> list)   {
        Comparable s1 = list.get(0);
        Comparable s2 = list.get(1);
        int result = s1.compareTo(s2) ;

    }

    public static void main (String [] args)    {
        List<Song> list = new ArrayList<>();


        Song o1 = new Song(2,"dabc", "xyz");
        Song o3 = new Song(2,"dabc", "xyz");
        Song o2 = new Song(3, "bbcd", "uyz");
        Song o4 = null;
        boolean r = o4 == null ? false : o4.equals(o1);
        if (o4!= null && o4.equals(o1))  {

        }

        Map<String, List<Song>> maplist = new HashMap<>();
        List<Song> list90 = new ArrayList<>();
        List<Song> list2000 = new ArrayList<>();
        list90.add(o1);
        list90.add(o2);
        list2000.add(o3);
        maplist.put("1990year", list90);
        maplist.put("2000year", list2000);
        List<Song> a = maplist.get("1990year");

        for (Map.Entry<String, List<Song>> entry : maplist.entrySet()) {
            System.out.println("key : " + entry.getKey() + " value : " + entry.getValue());
        }



        String s1 = null;
        //String s2 = "Hello";
        if ( HELLO.equals(s1))     {

        }
        Set<Song> set = new TreeSet<>(new TitleCompare());

        set.add(o1);
        set.add(o2);
        set.add(o3);
        System.out.println(set);
        System.out.println(o1.hashCode());
        System.out.println(o2.hashCode());
        System.out.println(o3.hashCode());

        list.add(o1);
        list.add(o2);
        System.out.println(list);

        TitleCompare titleCompare = new TitleCompare();
        Collections.sort(list, titleCompare);
        mysort(list, titleCompare);

        System.out.println(list);

        Collections.sort(list, new IdCompare());
        /*Collections.sort(list);*/
        System.out.println(list);

        /*int result = o1.compareTo(o2);*/

    }

    static class TitleCompare implements Comparator<Song>     {
        public int compare (Song one, Song two) {
            return one.getTitle().compareTo(two.getTitle());
        }
    }

    static class IdCompare implements Comparator<Song>     {
        public int compare (Song one, Song two) {
            return Integer.compare(one.getId(), two.getId());
            /*if (one.getId() == two.getId()) {
                return 0;
            } else if (one.getId() < two.getId()) {
                return -1;
            } else {
                return 1;
            }*/
        }
    }





    /*@Override*/
    /*public int compareTo(Song o) {
        return this.title.compareTo(o.getTitle());
        *//*if (this.id == o.getId()) {
            return 0;
        } else if (this.id < o.getId()) {
            return -1;
        } else {
            return 1;
        }*//*
    }*/
}
