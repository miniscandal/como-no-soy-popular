#include <stdio.h>
#include <string.h>

struct Character
{
    char name[50];
    char kingdom[50];
    int age;
};

void introduceCharacter(struct Character p)
{
    printf("Hello, my name is %s, I'm %d years old and I come from the %s.\n", p.name, p.age, p.kingdom);

    if (strcmp(p.name, "Flame Princess") == 0)
    {
        struct Character sweetPrincess = {"Sweet Princess", "Sweet Kingdom", 18};

        printf("\n");

        printf("Hello %s, I'm %s, It's nice to meet you.\n", p.name, sweetPrincess.name);
        printf("I come from the %s. \n", sweetPrincess.kingdom);
        printf("I'm %d years old, but with my scientific knowledge, ", sweetPrincess.age);
        printf("I can appear to be %d years old like you, so we can be friends. \n", p.age);

        printf("\n");
    }
}

int main()
{
    struct Character characters[3] = {
        {"Finn", "Human Kingdom", 14},
        {"Jake", "Ooo Kingdom", 28},
        {"Flame Princess", "Fire Kingdom", 14}};

    for (int i = 0; i < 3; i++)
    {
        introduceCharacter(characters[i]);
    }

    return 0;
}
