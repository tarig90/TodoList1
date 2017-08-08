package com.todolist.demo.ModelLayer;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.util.Date;

@Entity
public class ToDoModelList
{

        @Id
        @GeneratedValue(strategy = GenerationType.AUTO)
        private long id;
        private String toDoTaskTitle;
        private String toDoTaskDetails;
        private String toDoTaskPriority;
        private Date toDoTaskStartDate;
        private Date toDoTaskEndDate;

        public String getToDoTaskTitle() {
            return toDoTaskTitle;
        }

        public void setToDoTaskTitle(String toDoTaskTitle) {
            this.toDoTaskTitle = toDoTaskTitle;
        }

        public String getToDoTaskDetails() {
            return toDoTaskDetails;
        }

        public void setToDoTaskDetails(String toDoTaskDetails) {
            this.toDoTaskDetails = toDoTaskDetails;
        }

        public String getToDoTaskPriority() {
            return toDoTaskPriority;
        }

        public void setToDoTaskPriority(String toDoTaskPriority) {
            this.toDoTaskPriority = toDoTaskPriority;
        }

        public Date getToDoTaskStartDate() {
            return toDoTaskStartDate;
        }

        public void setToDoTaskStartDate(Date toDoTaskStartDate) {
            this.toDoTaskStartDate = toDoTaskStartDate;
        }

        public Date getToDoTaskEndDate() {
            return toDoTaskEndDate;
        }

        public void setToDoTaskEndDate(Date toDoTaskEndDate) {
            this.toDoTaskEndDate = toDoTaskEndDate;
        }

        public long getId() {
            return id;
        }

        public void setId(long id) {
            this.id = id;
        }
}
