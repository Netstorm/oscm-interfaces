/*******************************************************************************
 *                                                                              
 *  Copyright FUJITSU LIMITED 2016                                           
 *                                                                                                                                 
 *  Creation Date: May 3, 2016                                                      
 *                                                                              
 *******************************************************************************/

package org.oscm.rest.mock.data;

import java.util.Date;

/**
 * Representation class of trigger processes.
 * 
 * @author miethaner
 */
public class TriggerProcessRepresentation {

    public static class Author {
        private Long id;
        private String email;

        public Author() {
        }

        public Author(Long id, String email) {
            this.id = id;
            this.email = email;
        }

        public Long getId() {
            return id;
        }

        public void setId(Long id) {
            this.id = id;
        }

        public String getEmail() {
            return email;
        }

        public void setEmail(String email) {
            this.email = email;
        }
    }

    public static class Subscription {
        private Long id;
        private String name;

        public Subscription() {
        }

        public Subscription(Long id, String name) {
            this.id = id;
            this.name = name;
        }

        public Long getId() {
            return id;
        }

        public void setId(Long id) {
            this.id = id;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }
    }

    public static class Product {

        public static class Parameter {
            private String name;
            private String value;

            public Parameter() {
            }

            public Parameter(String name, String value) {
                this.name = name;
                this.value = value;
            }

            public String getName() {
                return name;
            }

            public void setName(String name) {
                this.name = name;
            }

            public String getValue() {
                return value;
            }

            public void setValue(String value) {
                this.value = value;
            }
        }

        private String name;
        private Parameter[] parameters;

        public Product() {
        }

        public Product(String name, Parameter[] parameters) {
            super();
            this.name = name;
            this.parameters = parameters;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public Parameter[] getParameters() {
            return parameters;
        }

        public void setParameters(Parameter[] parameters) {
            this.parameters = parameters;
        }
    }

    public static class Links {
        private Long trigger_id;
        private Long author_id;
        private Long subscription_id;

        public Links() {
        }

        public Links(Long trigger_id, Long author_id, Long subscription_id) {
            this.trigger_id = trigger_id;
            this.author_id = author_id;
            this.subscription_id = subscription_id;
        }

        public Long getTrigger_id() {
            return trigger_id;
        }

        public void setTrigger_id(Long definition_id) {
            this.trigger_id = definition_id;
        }

        public Long getAuthor_id() {
            return author_id;
        }

        public void setAuthor_id(Long author_id) {
            this.author_id = author_id;
        }

        public Long getSubscription_id() {
            return subscription_id;
        }

        public void setSubscription_id(Long subscription_id) {
            this.subscription_id = subscription_id;
        }
    }

    private Long id;
    private Date activation_time;
    private String status;
    private String comment;
    private Author author;
    private Subscription subscription;
    private Product product;
    private Links links;

    public TriggerProcessRepresentation() {
    }

    public TriggerProcessRepresentation(Long id, Date activation_time,
            String status, String comment, Author author,
            Subscription subscription, Product product, Links links) {
        this.id = id;
        this.activation_time = activation_time;
        this.status = status;
        this.comment = comment;
        this.author = author;
        this.subscription = subscription;
        this.product = product;
        this.links = links;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getStatusRest() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    public Date getActivationTime() {
        return activation_time;
    }

    public void setActivitionTime(Date activition_time) {
        this.activation_time = activition_time;
    }

    public Long getTriggerId() {
        if (links != null) {
            return links.getTrigger_id();
        } else {
            return null;
        }
    }

    public void setTriggerId(Long definition_id) {
        if (links == null) {
            links = new Links();
        }

        links.setTrigger_id(definition_id);
    }

    public Long getAuthorId() {
        if (links != null) {
            return links.getAuthor_id();
        } else {
            return null;
        }
    }

    public void setAuthorId(Long author_id) {
        if (links == null) {
            links = new Links();
        }

        links.setAuthor_id(author_id);
    }

    public Author getAuthor() {
        return author;
    }

    public void setAuthor(Author author) {
        this.author = author;
    }

    public Long getSubscriptionId() {
        if (links != null) {
            return links.getSubscription_id();
        } else {
            return null;
        }
    }

    public void setSubscriptionId(Long subscription_id) {
        if (links == null) {
            links = new Links();
        }

        links.setSubscription_id(subscription_id);
    }

    public Subscription getSubscription() {
        return subscription;
    }

    public void setSubscription(Subscription subscription) {
        this.subscription = subscription;
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }
}
