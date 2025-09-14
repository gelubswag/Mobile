from os import mkdir
from glob import glob


def select_module():
    """
    Select a module to create tasks in.
    """
    modules = glob("*/")
    for i, module in enumerate(modules):
        print(f"{i+1}. {module}")
    print("0. Custom module name")
    module_index = int(input("Select a module: ")) - 1
    if module_index == -1:
        module_name = input("Enter module name: ")
    else:
        module_name = modules[module_index].strip("/")
    return module_name


def create_tasks_in_module(module_name, task_id):
    """
    Create a new task in a module.
    """
    try:
        mkdir(f"{module_name}/Task{task_id}")
    except FileExistsError:
        print(f"Task{task_id} already exists")
    with open(f"{module_name}/Task{task_id}/Solution.java", "w"):
        pass


def main():
    module_name = select_module()
    task_id = input("Enter count of tasks: ")
    for i in range(int(task_id)):
        create_tasks_in_module(module_name, i+1)


if __name__ == "__main__":
    while input("Continue? (y/n) default: y") != "n":
        main()
