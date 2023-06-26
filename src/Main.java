import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {

        File file = new File("page1.txt");
        FileWriter fw = new FileWriter(file);
        PrintWriter pw = new PrintWriter(fw);

        pw.println("Chapter 1 Introducing Bedework 3.6\n" +
                "1.1\n" +
                "Bedework System Overview\n" +
                "Bedework is an open-source enterprise calendar system that supports public, personal, and\n" +
                "group calendaring. It is designed to conform to current calendaring standards with a goal of\n" +
                "attaining strong interoperability between other calendaring systems and clients. Bedework is\n" +
                "built with an emphasis on higher education, though it is used by many commercial\n" +
                "enterprises.\n" +
                "You may choose to deploy Bedework for public events calendaring, personal calendaring and\n" +
                "scheduling, or both. Bedework is suitable for embedding in other applications or in portals\n" +
                "and has been deployed across a wide range of environments.\n" +
                "Bedework System Architecture\n" +
                "Bedework 3.6 has a central server architecture and is modular and extensible. It consists of\n" +
                "the following components:\n" +
                "• Bedework core calendar engine\n" +
                "• Public events web client, called a “Calendar Suite”, for display of public events\n" +
                "•\n" +
                "•\n" +
                "•\n" +
                "•\n" +
                "•\n" +
                "Public events administration web client for entering public events, moderating\n" +
                "pending events from the submissions client, and configuring calendar suites\n" +
                "Public events submission web client for authenticated members of your community\n" +
                "to suggest public events – these become pending events in the admin client\n" +
                "Personal and group calendaring web client with a subscription model to Bedework\n" +
                "public calendars, user calendars, and external calendar feeds\n" +
                "CalDAV server for integration with CalDAV capable desktop (and web) clients such\n" +
                "as Apple's iCal or Mozilla Lightning\n" +
                "CardDAV server supporting contacts for scheduling in the personal client. This server\n" +
                "will become more heavily used in future versions of Bedework for contacts, locations,\n" +
                "and other resources.\n" +
                "• TimeZone server for support of timezone information\n" +
                "• Dump/Restore command-line utilities for database backup, initialization, and\n" +
                "Mar 31, 2010\n" +
                "Go to table of contents\n" +
                "p.8\n");


        pw.close();

//        page2
        File file2 = new File("page2.txt");
        FileWriter fw2 = new FileWriter(file2);
        PrintWriter pw2 = new PrintWriter(fw2);

        pw2.println("The Bedework system is divided into two main spaces: the public events space, and the\n" +
                "personal and group calendaring space which are kept separate by design. Public events are\n" +
                "stored below a public calendar root folder and personal calendars are below a user calendar\n" +
                "root folder.\n" +
                "PUBLIC PERSONAL & GROUP\n" +
                "EVENTS EVENTS\n" +
                "calendars & events are calendars & events are\n" +
                "publicly viewable unless private unless shared\n" +
                "hidden or access is changed \n" +
                "root is /public root is /user\n" +
                "Personal calendar users (and other clients) can subscribe to public events, but users may only\n" +
                "add public events using the Administrative and Community Submissions web clients. For\n" +
                "more information about Bedework's public and personal event calendaring models, see\n" +
                "chapters 4 and 5.\n" +
                "Features of Bedework\n" +
                "•\n" +
                "•\n" +
                "Java : Written completely in Java, Bedework is system independent. Currently it will\n" +
                "compile and run in Java 1.5 or later.\n" +
                "Standards based and interoperable : Interoperability with other calendar systems and\n" +
                "clients by way of standards compliance is a fundamental design goal of the Bedework\n" +
                "system. The following standards are supported:\n" +
                "iCalendar support (rfc2445)\n" +
                "iTIP (rfc2446)\n" +
                "CalDAV (rfc4791)\n" +
                "CalDAV scheduling (draft)\n" +
                "VVenue (draft)\n" +
                "•\n" +
                "CalDAV server : a full CalDAV server is a core feature of Bedework. It can be used\n" +
                "with any CalDAV capable client and has been shown to work with Mozilla Lightning,");


        pw2.close();

//        page3
        File file3 = new File("page3.txt");
        FileWriter fw3 = new FileWriter(file3);
        PrintWriter pw3 = new PrintWriter(fw3);

        pw3.println("Apple's iCal, Evolution, and others.\n" +
                "•\n" +
                "Web clients : The Bedework web clients provide access to public events in guest mode\n" +
                "and to public and personal events in authenticated mode. All web clients are easily\n" +
                "skinned allowing a high degree of customization.\n" +
                "•\n" +
                "•\n" +
                "•\n" +
                "•\n" +
                "•\n" +
                "•\n" +
                "•\n" +
                "Public calendar suites : Public events are displayed using \"calendar suites\"\n" +
                "allowing multiple organizations to maintain their own public views of events\n" +
                "with whatever degree of visibility is appropriate. A Bedework public\n" +
                "calendaring installation may have one or many calendar suites. A calendar\n" +
                "suite provides a customized view of events, custom theming, and control over\n" +
                "how events are tagged by event administrators.\n" +
                "Personal calendars : Bedework provides a web client for personal and group\n" +
                "calendaring including scheduling. Using CalDAV desktop clients, users can see\n" +
                "a fully synchronized view of their personal and subscribed events between their\n" +
                "desktop client and the web client.\n" +
                "Administrative client for public events : Public event entry and maintenance is\n" +
                "carried out through the administrative web client. The system supports three\n" +
                "roles: Super Users control global system settings including user and calendar\n" +
                "maintenance and the setup of calendar suites. Calendar Suite Owners can\n" +
                "modify the settings of their calendar suite, and Event Administrators can add\n" +
                "and edit events for the administrative groups to which they belong.\n" +
                "Public event submission : Bedework provides a web client for submitting\n" +
                "events to a public queue allowing members of your community who are not\n" +
                "event administrators to suggest public events.\n" +
                "Highly customizable look and feel - XML & XSLT : The web clients are XML\n" +
                "and XSLT based allowing Bedework to be \"skinned\" for multiple clients and\n" +
                "uses. For example, the quickstart comes with skins for producing production\n" +
                "RSS, Javascript, and video feeds as well as HTML displays suitable for handheld\n" +
                "devices.\n" +
                "Database independence - Hibernate : The core of the calendar uses Hibernate for all\n" +
                "database transactions giving support of many database systems and enterprise level\n" +
                "performance and reliability. A number of caching schemes are implemented for\n" +
                "Hibernate including clustered systems giving further options for improving\n" +
                "availability.\n" +
                "Sharing : Full CalDAV access control is available allowing the sharing of calendars\n" +
                "and calendar entities based on authentication status and identity.\n" +
                "Mar 31, 2010\n" +
                "Go to table of contents\n" +
                "p.10");


        pw3.close();

//        exclude-words.txt.
        File file4 = new File("exclude-words.txt");
        FileWriter fw4 = new FileWriter(file4);
        PrintWriter pw4 = new PrintWriter(fw4);

        pw4.println("and");
        pw4.println("or");
        pw4.println("&");
        pw4.println("of");
        pw4.println("to");
        pw4.println("is");
        pw4.println("the");
        pw4.println("a");
        pw4.println("are");
        pw4.println("in");



        pw4.close();

//        index

        File file5 = new File("index.txt");
        FileWriter fw5 = new FileWriter(file5);
        PrintWriter pw5 = new PrintWriter(fw5);

        pw5.println("Line M");
        pw5.println("Line N");
        pw5.println("Line O");

        pw5.close();


//        exclude-word logic
        try {
            List<String> excludedWords = readExcludedWords("exclude-words.txt");
            Map<String, List<Integer>> wordIndex = generateWordIndex(excludedWords, "Page1.txt", "Page2.txt", "Page3.txt");
            writeIndexToFile(wordIndex, "index.txt");
            System.out.println("Index generated successfully!");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static List<String> readExcludedWords(String excludeWordsFile) throws IOException {
        List<String> excludedWords = new ArrayList<>();
        BufferedReader reader = new BufferedReader(new FileReader(excludeWordsFile));
        String line;
        while ((line = reader.readLine()) != null) {
            excludedWords.add(line.trim());
        }
        reader.close();
        return excludedWords;
    }

    private static Map<String, List<Integer>> generateWordIndex(List<String> excludedWords, String... pageFiles) throws IOException {
        Map<String, List<Integer>> wordIndex = new TreeMap<>();
        for (int page = 1; page <= pageFiles.length; page++) {
            BufferedReader reader = new BufferedReader(new FileReader(pageFiles[page - 1]));
            String line;
            while ((line = reader.readLine()) != null) {
                String[] words = line.split("\\s+");
                for (String word : words) {
                    word = word.toLowerCase();
                    if (!excludedWords.contains(word)) {
                        if (!wordIndex.containsKey(word)) {
                            wordIndex.put(word, new ArrayList<>());
                        }
                        List<Integer> pages = wordIndex.get(word);
                        if (!pages.contains(page)) {
                            pages.add(page);
                        }
                    }
                }
            }
            reader.close();
        }
        return wordIndex;
    }

    private static void writeIndexToFile(Map<String, List<Integer>> wordIndex, String outputFile) throws IOException {
        BufferedWriter writer = new BufferedWriter(new FileWriter(outputFile));
        for (Map.Entry<String, List<Integer>> entry : wordIndex.entrySet()) {
            String word = entry.getKey();
            List<Integer> pages = entry.getValue();
            writer.write(word + " : " + pagesToString(pages));
            writer.newLine();
        }
        writer.close();
    }

    private static String pagesToString(List<Integer> pages) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < pages.size(); i++) {
            sb.append(pages.get(i));
            if (i != pages.size() - 1) {
                sb.append(", ");
            }
        }
        return sb.toString();
    }
}