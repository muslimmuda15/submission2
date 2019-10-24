package com.dicoding.picodiploma.mybottomnavigation.tvshow;

import android.view.Display;

import com.dicoding.picodiploma.mybottomnavigation.ModelData;

import java.util.ArrayList;

public class TvShowData {
    public static String[][] detailTvShow = new String[][]{
        {"Fear the Walking Dead",
                "2015 - Now",
                "Alycia Debnam-Carey, Colman Domingo, Kim Dickens, Frank Dillane, Ruben Blades",
                "Robert Kirkman, Dave Erickson",
                "What did the world look like as it was transforming into the horrifying apocalypse depicted in The Walking Dead? This spin-off set in Los Angeles, following new characters as they face the beginning of the end of the world, will answer that question.",
                "https://resizing.flixster.com/jeXiba2yw3K8wIZibw-BczBxIYw=/206x305/v1.dDs1NDYzMDY7ajsxODIwMzsxMjAwOzE1MzY7MjA0OA"
        },

        {"Batwoman",
                "2019 - Now",
                "Ruby Rose, Elizabeth Anweis, Camrus Johnson, Nicole Kang, Dougray Scott",
                "Greg Berlanti, Caroline Dries",
                "Armed with a great passion for social justice and with a great facility to always say what she thinks, Kate Kane is known in the streets of Gotham as Batwoman, a lesbian highly trained to fight crime that resurfaces in the city. However, before becoming a savior, she must fight the demons that prevent her from being the symbol of the hope of a corrupt city.",
                "https://resizing.flixster.com/YSpiBW2EMdJ486PKf4-mfibuKuk=/206x305/v1.dDs1NTA3NjE7ajsxODIwMzsxMjAwOzgwMDsxMjAw"
        },

        {"The Flash",
                "2014 - Now",
                "Grant Gustin, Candice Patton, Carlos Valdes, Danielle Panabaker, Jesse L. Martin",
                "Geoff Johns, Andrew Kreisberg, Greg Berlanti",
                "After a particle accelerator causes a freak storm, CSI Investigator Barry Allen is struck by lightning and falls into a coma. Months later he awakens with the power of super speed, granting him the ability to move through Central City like an unseen guardian angel. Though initially excited by his newfound powers, Barry is shocked to discover he is not the only meta-human who was created in the wake of the accelerator explosion -- and not everyone is using their new powers for good. Barry partners with S.T.A.R. Labs and dedicates his life to protect the innocent. For now, only a few close friends and associates know that Barry is literally the fastest man alive, but it won't be long before the world learns what Barry Allen has become...The Flash.",
                "https://resizing.flixster.com/pDiqjt3eJJN12XZGpw5lsERzAxY=/206x305/v1.dDsyNTgyMDg7ajsxODE5OTsxMjAwOzIwMDA7MzAwMA"
        },

        {"Glee",
                "2009 - 2015",
                "Matthew Morrison, Jane Lynch, Lea Michele, Chris Colfer, Kevin McHale",
                "Ryan Murphy, Ian Brennan, Brad Falchuk",
                "In this musical comedy, optimistic high school teacher Will Schuester tries to refuel his own passion while reinventing the high school's glee club and challenging a group of outcasts to realize their star potential as they strive to outshine their singing competition while navigating the cruel halls of McKinley High.",
                "https://resizing.flixster.com/xilYBMYrwS2jb1VCEy-69LyFUjw=/206x305/v1.dDsxOTY3MTM7ajsxODE5OTsxMjAwOzEwODI7MTQ0MQ"
        },

        {"Riverdale",
                "2017 - Now",
                "KJ Apa, Camila Mendes, Lili Reinhart, Sarah Habel, Colo Sprouse",
                "Roberto Aguirre-Sacasa",
                "Set in the present, the series offers a bold, subversive take on Archie, Betty, Veronica and their friends, exploring the surreality of small-town life, the darkness and weirdness bubbling beneath Riverdale’s wholesome facade.",
            "https://resizing.flixster.com/79-4ufZo8tG7JzdRbsixQpmEFm4=/206x305/v1.dDszNjIyNjY7ajsxODIwMTsxMjAwOzExNjI7MTc0Mw"
        },

        {"Supernatural",
                "2005 - Now",
                "Jensen Ackles, Jared Padalecki, Misha Collins, Alexander Calvert, Ruth Connell",
                "Eric Kripke",
                "When they were boys, Sam and Dean Winchester lost their mother to a mysterious and demonic supernatural force. Subsequently, their father raised them to be soldiers. He taught them about the paranormal evil that lives in the dark corners and on the back roads of America ... and he taught them how to kill it. Now, the Winchester brothers crisscross the country in their '67 Chevy Impala, battling every kind of supernatural threat they encounter along the way.",
                "https://resizing.flixster.com/vyXQpsGYq1bCTo-qFiPqpDfcrdk=/206x305/v1.dDs5NDM1MDtqOzE4MTk3OzEyMDA7MTM1MDsxODAw"
        },

        {"Titans",
                "2018 - Now",
                "Alan Ritchson, Brenton Thwaites, Teagan Croft, Anna Diop, Ryan Potter",
                "Geoff Johns, Greg Berlanti, Akiva Goldsman",
                "A team of young superheroes led by Nightwing (formerly Batman's first Robin) form to combat evil and other perils.",
                "https://resizing.flixster.com/ZbEcCNC7CYC5it5C51Qvaqgfn9Y=/206x305/v1.dDszNDY0NTc7ajsxODIwMDsxMjAwOzMwMDA7NDQzMQ"
        },

        {"Young Sheldon",
                "2017 - Now",
                "Iain Armitage, Zoe Perry, Lance Barber, Montana Jordan, Raegan Revord",
                "Chuck Lorre, Steven Molaro",
                "The early life of child genius Sheldon Cooper, later seen in The Big Bang Theory.",
                "https://resizing.flixster.com/dZ663UAjSF_TdrIBdn2tFXNci1k=/206x305/v1.dDsyNjIwNjY7ajsxODE5OTsxMjAwOzE4MjA7MjczMA"
        },

        {"Legacies",
                "2018 - Now",
                "Danielle Rose Russel, Aria Shahghasemi, Matthew Davis, Kayle Bryant, Jenny Boyd",
                "Julie Plec",
                "In a place where young witches, vampires, and werewolves are nurtured to be their best selves in spite of their worst impulses, Klaus Mikaelson’s daughter, 17-year-old Hope Mikaelson, Alaric Saltzman’s twins, Lizzie and Josie Saltzman, among others, come of age into heroes and villains at The Salvatore School for the Young and Gifted.",
                "https://resizing.flixster.com/yb9pVJdqR5bTRKhT86x9roM_Knk=/206x305/v1.dDs1ODMyMDQ7ajsxODIwMzsxMjAwOzE5OTU7MjY2MA"
        },

        {"Hawaii Five-0",
                "2010 - Now",
                "Alex O'Loughlin, Scott Caan, Grace Park, Daniel Dae Kim, Masi Oka",
                "Leonard Freeman, Roberto Orci, Alex Kurtzman",
                "Steve McGarrett returns home to Oahu, in order to find his father's killer. The governor offers him the chance to run his own task force (Five-0). Steve's team is joined by Chin Ho Kelly, Danny Danno Williams, and Kono Kalakaua.",
                "https://resizing.flixster.com/_pdTMN8Iy0bBYIDUa_jbomSBVEU=/206x305/v1.dDsyMDE4Mjg7ajsxODE5OTsxMjAwOzIwMDA7MzAwMA"
        }
    };

    public static ArrayList<ModelData> getListTvShow(){
        ModelData modelData;
        ArrayList<ModelData> list = new ArrayList<>();
        for (String[] aData : detailTvShow){
            modelData = new ModelData();
            modelData.setTitle(aData[0]);
            modelData.setRelease(aData[1]);
            modelData.setCast(aData[2]);
            modelData.setDirector(aData[3]);
            modelData.setOverview(aData[4]);
            modelData.setPoster(aData[5]);
            list.add(modelData);
        }
        return list;
    }

}
