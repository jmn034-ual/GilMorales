import { LitElement, html, css, customElement } from 'lit-element';
import '@vaadin/vaadin-text-field/src/vaadin-text-field.js';
import '@polymer/iron-icon/iron-icon.js';
import '@vaadin/vaadin-ordered-layout/src/vaadin-vertical-layout.js';
import '@vaadin/vaadin-ordered-layout/src/vaadin-horizontal-layout.js';
import '@vaadin/vaadin-button/src/vaadin-button.js';
import '@vaadin/vaadin-avatar/src/vaadin-avatar.js';
import '@vaadin/vaadin-messages/src/vaadin-message-input-text-area.js';

@customElement('my-view')
export class MyView extends LitElement {
  static get styles() {
    return css`
      :host {
          display: block;
          height: 100%;
      }
      `;
  }

  render() {
    return html`
<vaadin-vertical-layout style="width: 100%; height: 100%;">
 <vaadin-horizontal-layout class="header" style="width: 100%; flex-basis: var(--lumo-size-l); flex-shrink: 0; background-color: var(--lumo-contrast-10pct); align-self: flex-start; align-items: center; justify-content: space-evenly;">
  <vaadin-vertical-layout theme="spacing" style="flex-grow: 0;">
   <vaadin-button theme="icon" aria-label="Add new">
    <iron-icon icon="lumo:plus"></iron-icon>
   </vaadin-button>
  </vaadin-vertical-layout>
  <vaadin-text-field placeholder="Buscar..." style="align-self: center; flex-grow: 0; width: 50%;">
   <iron-icon icon="lumo:search" slot="prefix"></iron-icon>
  </vaadin-text-field>
  <vaadin-button>
    Inicio 
  </vaadin-button>
  <vaadin-button>
    Notificaciones 
  </vaadin-button>
  <vaadin-button>
    Añadir 
  </vaadin-button>
  <vaadin-button>
    Perfil 
  </vaadin-button>
  <vaadin-button>
    Cerrar Sesión 
  </vaadin-button>
 </vaadin-horizontal-layout>
 <vaadin-horizontal-layout style="width: 100%; flex-grow: 1; flex-shrink: 1; flex-basis: auto;">
  <vaadin-vertical-layout class="sidebar" style="flex-basis: calc(7*var(--lumo-size-s)); flex-shrink: 0; background-color: var(--lumo-contrast-5pct); margin: var(--lumo-space-xs);">
   <vaadin-vertical-layout style="width: 100%; align-self: center; flex-shrink: 0;">
    <h3 style="align-self: center; flex-shrink: 0; margin-top: var(--lumo-space-m); margin: var(--lumo-space-l);">Top Usuarios</h3>
    <vaadin-vertical-layout theme="spacing-xs" style="align-self: stretch; align-items: center;">
     <vaadin-horizontal-layout theme="spacing">
      <vaadin-avatar></vaadin-avatar>
      <vaadin-button>
        Button 
      </vaadin-button>
     </vaadin-horizontal-layout>
     <vaadin-horizontal-layout theme="spacing">
      <vaadin-avatar></vaadin-avatar>
      <vaadin-button>
        Button 
      </vaadin-button>
     </vaadin-horizontal-layout>
     <vaadin-horizontal-layout theme="spacing">
      <vaadin-avatar></vaadin-avatar>
      <vaadin-button>
        Button 
      </vaadin-button>
     </vaadin-horizontal-layout>
     <vaadin-horizontal-layout theme="spacing">
      <vaadin-avatar></vaadin-avatar>
      <vaadin-button>
        Button 
      </vaadin-button>
     </vaadin-horizontal-layout>
     <vaadin-horizontal-layout theme="spacing">
      <vaadin-avatar></vaadin-avatar>
      <vaadin-button>
        Button 
      </vaadin-button>
     </vaadin-horizontal-layout>
    </vaadin-vertical-layout>
    <vaadin-button style="align-self: center;">
      Ver lista Usuarios 
    </vaadin-button>
   </vaadin-vertical-layout>
   <vaadin-vertical-layout style="flex-grow: 0; width: 100%;">
    <h3 style="align-self: center; flex-shrink: 0; margin: var(--lumo-space-l); margin-top: var(--lumo-space-m);">Top Hashtags</h3>
    <vaadin-horizontal-layout theme="spacing" style="align-self: center;">
     <vaadin-button>
       Button 
     </vaadin-button>
    </vaadin-horizontal-layout>
    <vaadin-horizontal-layout theme="spacing" style="align-self: center;">
     <vaadin-button>
       Button 
     </vaadin-button>
    </vaadin-horizontal-layout>
    <vaadin-horizontal-layout theme="spacing" style="align-self: center;">
     <vaadin-button>
       Button 
     </vaadin-button>
    </vaadin-horizontal-layout>
    <vaadin-horizontal-layout theme="spacing" style="align-self: center;">
     <vaadin-button>
       Button 
     </vaadin-button>
    </vaadin-horizontal-layout>
    <vaadin-horizontal-layout theme="spacing" style="align-self: center;">
     <vaadin-button>
       Button 
     </vaadin-button>
    </vaadin-horizontal-layout>
    <vaadin-button style="align-self: center;">
      Ver lista Hashtags 
    </vaadin-button>
   </vaadin-vertical-layout>
  </vaadin-vertical-layout>
  <vaadin-vertical-layout class="content" style="flex-grow: 1; flex-shrink: 1; flex-basis: auto;">
   <vaadin-horizontal-layout theme="spacing-xl" style="align-self: center; flex-shrink: 0; width: 70%; margin: var(--lumo-space-xl);" id="Publicaciones">
    <vaadin-vertical-layout theme="spacing">
     <vaadin-avatar></vaadin-avatar>
    </vaadin-vertical-layout>
    <vaadin-vertical-layout theme="spacing" style="width: 25%;">
     <vaadin-button>
       Button 
     </vaadin-button>
     <label style="align-self: flex-start; margin-top: var(--lumo-space-xs);">Geolocalización...</label>
     <img src="./luffy.jpg" style="width: 100%;">
    </vaadin-vertical-layout>
    <vaadin-vertical-layout theme="spacing" style="flex-grow: 1;">
     <vaadin-horizontal-layout theme="spacing" style="align-self: stretch; justify-content: flex-end;">
      <vaadin-button>
        Seguir 
      </vaadin-button>
      <vaadin-button>
        Denunciar 
      </vaadin-button>
     </vaadin-horizontal-layout>
     <vaadin-horizontal-layout style="align-self: stretch; justify-content: space-evenly; flex-shrink: 0; margin: var(--lumo-space-xl);">
      <vaadin-vertical-layout theme="spacing">
       <label style="align-self: center;">Label</label>
       <vaadin-button>
         Me gusta 
       </vaadin-button>
      </vaadin-vertical-layout>
      <vaadin-vertical-layout theme="spacing">
       <label style="flex-grow: 0; align-self: center;">Label</label>
       <vaadin-button>
         Ver Comentarios 
       </vaadin-button>
      </vaadin-vertical-layout>
     </vaadin-horizontal-layout>
     <vaadin-horizontal-layout theme="spacing" style="align-self: stretch; height: 40%;">
      <label style="height: 100%; width: 100%;">Descripción...</label>
     </vaadin-horizontal-layout>
     <vaadin-horizontal-layout theme="spacing" style="align-self: stretch; margin: var(--lumo-space-xs);">
      <vaadin-message-input-text-area></vaadin-message-input-text-area>
      <vaadin-button>
        Comentar 
      </vaadin-button>
     </vaadin-horizontal-layout>
    </vaadin-vertical-layout>
   </vaadin-horizontal-layout>
   <vaadin-horizontal-layout theme="spacing-xl" style="align-self: center; flex-shrink: 0; width: 70%; margin: var(--lumo-space-xl);" id="Publicaciones">
    <vaadin-vertical-layout theme="spacing">
     <vaadin-avatar></vaadin-avatar>
    </vaadin-vertical-layout>
    <vaadin-vertical-layout theme="spacing" style="width: 25%;">
     <vaadin-button>
       Button 
     </vaadin-button>
     <label style="align-self: flex-start; margin-top: var(--lumo-space-xs);">Geolocalización...</label>
     <img src="./luffy.jpg" style="width: 100%;">
    </vaadin-vertical-layout>
    <vaadin-vertical-layout theme="spacing" style="flex-grow: 1;">
     <vaadin-horizontal-layout theme="spacing" style="align-self: stretch; justify-content: flex-end;">
      <vaadin-button>
        Seguir 
      </vaadin-button>
      <vaadin-button>
        Denunciar 
      </vaadin-button>
     </vaadin-horizontal-layout>
     <vaadin-horizontal-layout style="align-self: stretch; justify-content: space-evenly; flex-shrink: 0; margin: var(--lumo-space-xl);">
      <vaadin-vertical-layout theme="spacing">
       <label style="align-self: center;">Label</label>
       <vaadin-button>
         Me gusta 
       </vaadin-button>
      </vaadin-vertical-layout>
      <vaadin-vertical-layout theme="spacing">
       <label style="flex-grow: 0; align-self: center;">Label</label>
       <vaadin-button>
         Ver Comentarios 
       </vaadin-button>
      </vaadin-vertical-layout>
     </vaadin-horizontal-layout>
     <vaadin-horizontal-layout theme="spacing" style="align-self: stretch; height: 40%;">
      <label style="height: 100%; width: 100%;">Descripción...</label>
     </vaadin-horizontal-layout>
     <vaadin-horizontal-layout theme="spacing" style="align-self: stretch; margin: var(--lumo-space-xs);">
      <vaadin-message-input-text-area></vaadin-message-input-text-area>
      <vaadin-button>
        Comentar 
      </vaadin-button>
     </vaadin-horizontal-layout>
    </vaadin-vertical-layout>
   </vaadin-horizontal-layout>
  </vaadin-vertical-layout>
 </vaadin-horizontal-layout>
</vaadin-vertical-layout>
`;
>>>>>>> branch 'main' of git@github.com:jmn034-ual/GilMorales.git
  }

  // Remove this method to render the contents of this view inside Shadow DOM
  createRenderRoot() {
    return this;
  }
}
