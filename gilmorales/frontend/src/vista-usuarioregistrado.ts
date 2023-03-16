import { LitElement, html, css, customElement } from 'lit-element';
import '@vaadin/vaadin-ordered-layout/src/vaadin-horizontal-layout.js';
import '@vaadin/vaadin-text-field/src/vaadin-text-field.js';
import '@polymer/iron-icon/iron-icon.js';
import '@vaadin/vaadin-button/src/vaadin-button.js';
import '@vaadin/vaadin-ordered-layout/src/vaadin-vertical-layout.js';
import '@vaadin/vaadin-split-layout/src/vaadin-split-layout.js';

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
 <vaadin-horizontal-layout class="header" style="width: 100%; flex-basis: var(--lumo-size-l); flex-shrink: 0; background-color: var(--lumo-contrast-10pct); justify-content: flex-end; align-self: flex-start; align-items: flex-start;">
  <vaadin-horizontal-layout theme="spacing" style="width: 20%;">
   <vaadin-button>
     Button 
   </vaadin-button>
  </vaadin-horizontal-layout>
  <vaadin-text-field placeholder="Buscar..." style="flex-grow: 0; flex-shrink: 0; align-self: center; margin-left: var(--lumo-space-s); margin-right: var(--lumo-space-s); width: 10%;">
   <iron-icon icon="lumo:search" slot="prefix"></iron-icon>
  </vaadin-text-field>
  <vaadin-button style="flex-shrink: 0; flex-grow: 0; margin-left: var(--lumo-space-s); margin-right: var(--lumo-space-s);">
    Inicio 
  </vaadin-button>
  <vaadin-button style="flex-grow: 0; flex-shrink: 0; margin-left: var(--lumo-space-s); margin-right: var(--lumo-space-s);">
    Notificaciones 
  </vaadin-button>
  <vaadin-button style="flex-shrink: 0; margin-right: var(--lumo-space-s); margin-left: var(--lumo-space-s);">
    Añadir 
  </vaadin-button>
  <vaadin-button style="flex-shrink: 0; margin-left: var(--lumo-space-s);">
    Perfil 
  </vaadin-button>
  <vaadin-button style="flex-shrink: 0; margin-left: var(--lumo-space-s); margin-right: var(--lumo-space-s);">
    Cerrar Sesión 
  </vaadin-button>
 </vaadin-horizontal-layout>
 <vaadin-horizontal-layout style="width: 100%; flex-grow: 1; flex-shrink: 1; flex-basis: auto;">
  <vaadin-vertical-layout class="sidebar" style="flex-basis: calc(7*var(--lumo-size-s)); flex-shrink: 0; background-color: var(--lumo-contrast-5pct);">
   <vaadin-split-layout orientation="vertical" style="width: 100%; height: 100%;">
    <div style="align-self: center; flex-shrink: 0; flex-grow: 1;">
     <h2>Top Usuarios</h2>
    </div>
    <div slot="secondary" style="flex-shrink: 0; align-self: center; flex-grow: 1;">
     <h2>Top Tendencias</h2>
    </div>
   </vaadin-split-layout>
  </vaadin-vertical-layout>
  <vaadin-vertical-layout class="content" style="flex-grow: 1; flex-shrink: 1; flex-basis: auto;">
   <vaadin-horizontal-layout theme="spacing" class="Primer loyaout" style="width: 100%; height: 50%;"></vaadin-horizontal-layout>
  </vaadin-vertical-layout>
<vaadin-horizontal-layout theme="spacing" class="Primer loyaout" style="width: 100%; height: 50%;"></vaadin-horizontal-layout>
  </vaadin-vertical-layout>
 </vaadin-horizontal-layout>
</vaadin-vertical-layout>
`;
  }

  // Remove this method to render the contents of this view inside Shadow DOM
  createRenderRoot() {
    return this;
  }
}
